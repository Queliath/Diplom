package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestDao;
import by.bsuir.em.entity.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Test> getTests() {
        TypedQuery<Test> query = entityManager.createQuery("select t from Test t", Test.class);
        List<Test> testList = query.getResultList();
        if (!testList.isEmpty()) {
            setQuestionsCountForTestList(testList);
        }
        return testList;
    }

    @Override
    public Test getTestById(Long id) {
        Test test = entityManager.find(Test.class, id);
        if (test != null) {
            setQuestionsCountForSingleTest(test);
        }
        return test;
    }

    private void setQuestionsCountForTestList(List<Test> testList) {
        TypedQuery<Test> query = entityManager.createQuery("select new Test(t.id, count(q.id)) from Test t left join t.questions q where t.id in (:testIds) group by t.id", Test.class);
        List<Long> testIds = new ArrayList<>(testList.size());
        for (Test test : testList) {
            testIds.add(test.getId());
        }
        List<Test> testListWithQuestionsCount = query.setParameter("testIds", testIds).getResultList();

        for (Test test : testList) {
            for (Test testWithQuestionsCount : testListWithQuestionsCount) {
                if (test.getId().equals(testWithQuestionsCount.getId())) {
                    test.setQuestionsCount(testWithQuestionsCount.getQuestionsCount());
                    break;
                }
            }
        }
    }

    private void setQuestionsCountForSingleTest(Test test) {
        TypedQuery<Long> query = entityManager.createQuery("select count(q.id) from Test t left join t.questions q where t.id = :testId", Long.class);
        Long questionsCount = query.setParameter("testId", test.getId()).getSingleResult();
        test.setQuestionsCount(questionsCount);
    }
}
