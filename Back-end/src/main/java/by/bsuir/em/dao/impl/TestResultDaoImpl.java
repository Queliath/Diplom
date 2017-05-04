package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestResultDao;
import by.bsuir.em.entity.TestResult;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public class TestResultDaoImpl implements TestResultDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TestResult> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        TypedQuery<TestResult> query = entityManager.createQuery("select tr from TestResult tr join fetch tr.testResultPk.test where tr.testResultPk.employee.id = :employeeId and " +
                "tr.testResultPk.testPeriod.id = :testPeriodId", TestResult.class);
        return query.setParameter("employeeId", employeeId).setParameter("testPeriodId", testPeriodId).getResultList();
    }

    @Override
    public TestResult addTestResult(TestResult testResult) {
        entityManager.persist(testResult);
        return testResult;
    }

    @Override
    public Double getSuccessByAnswers(Map<Long, Long> answers) {
        StringBuilder queryBuilder = new StringBuilder("select (cast(atr.actual_test_result as decimal) / mtr.max_test_result) * 100 from (select sum(ao.value) as actual_test_result from em_answer_options ao where ao.id in (");
        for (Long answerOptionId : answers.values()) {
            queryBuilder.append(answerOptionId).append(",");
        }
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);
        queryBuilder.append(")) atr, (select sum(mv.max_value) as max_test_result from (select ao.question_id, max(ao.value) as max_value from em_answer_options ao where ao.question_id in (");
        for (Long questionId : answers.keySet()) {
            queryBuilder.append(questionId).append(",");
        }
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);
        queryBuilder.append(") group by ao.question_id) mv) mtr");
        Query query = entityManager.createNativeQuery(queryBuilder.toString());
        return ((BigDecimal) query.getSingleResult()).doubleValue();
    }
}
