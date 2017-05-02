package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestResultDao;
import by.bsuir.em.entity.TestResult;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TestResultDaoImpl implements TestResultDao {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<TestResult> getTestResultsByEmployeeId(Long employeeId) {
        return null;
    }

    @Override
    public List<TestResult> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        return null;
    }
}
