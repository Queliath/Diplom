package by.bsuir.em.dao;

import by.bsuir.em.entity.TestResult;

import java.util.List;

public interface TestResultDao {
    List<TestResult> getTestResultsByEmployeeId(Long employeeId);
    List<TestResult> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId);
}
