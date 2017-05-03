package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestResultDao;
import by.bsuir.em.entity.TestResult;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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
}
