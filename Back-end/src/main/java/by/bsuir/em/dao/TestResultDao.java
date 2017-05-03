package by.bsuir.em.dao;

import by.bsuir.em.entity.TestResult;

import java.util.List;

public interface TestResultDao {
    List<TestResult> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId);
    TestResult addTestResult(TestResult testResult);
}
