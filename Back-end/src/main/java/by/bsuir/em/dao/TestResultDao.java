package by.bsuir.em.dao;

import by.bsuir.em.entity.TestResult;

import java.util.List;
import java.util.Set;

public interface TestResultDao {
    List<TestResult> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId);
    TestResult addTestResult(TestResult testResult);
    Double getSuccessByAnswers(Long testId, Set<Long> answers);
}
