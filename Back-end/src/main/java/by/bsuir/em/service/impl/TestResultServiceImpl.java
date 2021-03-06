package by.bsuir.em.service.impl;

import by.bsuir.em.dao.TestResultDao;
import by.bsuir.em.dao.TestTaskDao;
import by.bsuir.em.dto.TestResultDto;
import by.bsuir.em.dto.converter.impl.TestResultDtoConverter;
import by.bsuir.em.entity.*;
import by.bsuir.em.service.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TestResultServiceImpl implements TestResultService {
    @Autowired
    private TestResultDao testResultDao;
    @Autowired
    private TestTaskDao testTaskDao;
    @Autowired
    private TestResultDtoConverter testResultDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<TestResultDto> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        List<TestResult> testResultList = testResultDao.getTestResultsByEmployeeIdAndTestPeriodId(employeeId, testPeriodId);
        return testResultDtoConverter.getDtoList(testResultList);
    }

    @Override
    public TestResultDto addTestResult(TestResultDto testResultDto) {
        TestTask.TestTaskPk testTaskPk = new TestTask.TestTaskPk();
        Employee employee = new Employee();
        employee.setId(testResultDto.getEmployeeId());
        TestPeriod testPeriod = new TestPeriod();
        testPeriod.setId(testResultDto.getTestPeriodId());
        Test test = new Test();
        test.setId(testResultDto.getTestId());
        testTaskPk.setEmployee(employee);
        testTaskPk.setTestPeriod(testPeriod);
        testTaskPk.setTest(test);
        testTaskDao.deleteTestTaskByPk(testTaskPk);

        Double testSuccess = testResultDao.getSuccessByAnswers(testResultDto.getTestId(), testResultDto.getAnswers());
        testResultDto.setSuccess(testSuccess);

        TestResult testResult = testResultDtoConverter.getEntity(testResultDto);
        TestResult addedTestResult = testResultDao.addTestResult(testResult);
        return testResultDtoConverter.getDto(addedTestResult);
    }
}
