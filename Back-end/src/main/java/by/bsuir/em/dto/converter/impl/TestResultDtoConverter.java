package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.TestResultDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Employee;
import by.bsuir.em.entity.Test;
import by.bsuir.em.entity.TestPeriod;
import by.bsuir.em.entity.TestResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestResultDtoConverter implements DtoConverter<TestResult, TestResultDto> {
    @Override
    public TestResultDto getDto(TestResult entity) {
        TestResultDto testResultDto = new TestResultDto();
        testResultDto.setTestId(entity.getTestResultPk().getTest().getId());
        testResultDto.setTestName(entity.getTestResultPk().getTest().getName());
        testResultDto.setFixedTime(entity.getTestResultPk().getTest().getFixedTime());
        testResultDto.setSuccess(entity.getSuccess());

        return testResultDto;
    }

    @Override
    public TestResult getEntity(TestResultDto dto) {
        TestResult testResult = new TestResult();
        TestResult.TestResultPk testResultPk = new TestResult.TestResultPk();
        Test test = new Test();
        test.setId(dto.getTestId());
        Employee employee = new Employee();
        employee.setId(dto.getEmployeeId());
        TestPeriod testPeriod = new TestPeriod();
        testPeriod.setId(dto.getTestPeriodId());
        testResultPk.setTest(test);
        testResultPk.setEmployee(employee);
        testResultPk.setTestPeriod(testPeriod);
        testResult.setTestResultPk(testResultPk);
        testResult.setSuccess(dto.getSuccess());

        return testResult;
    }

    @Override
    public List<TestResultDto> getDtoList(List<TestResult> entityList) {
        List<TestResultDto> testResultDtoList = new ArrayList<>();
        for (TestResult testResult : entityList) {
            testResultDtoList.add(getDto(testResult));
        }

        return testResultDtoList;
    }
}
