package by.bsuir.em.service;

import by.bsuir.em.dto.TestResultDto;

import java.util.List;

public interface TestResultService {
    List<TestResultDto> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId);
    TestResultDto addTestResult(TestResultDto testResultDto);
}
