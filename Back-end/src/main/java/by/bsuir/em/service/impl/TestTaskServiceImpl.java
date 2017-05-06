package by.bsuir.em.service.impl;

import by.bsuir.em.dao.TestPeriodDao;
import by.bsuir.em.dao.TestTaskDao;
import by.bsuir.em.dto.TestTaskDto;
import by.bsuir.em.dto.converter.impl.TestTaskDtoConverter;
import by.bsuir.em.entity.Employee;
import by.bsuir.em.entity.Test;
import by.bsuir.em.entity.TestPeriod;
import by.bsuir.em.entity.TestTask;
import by.bsuir.em.service.TestTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestTaskServiceImpl implements TestTaskService {
    @Autowired
    private TestTaskDao testTaskDao;
    @Autowired
    private TestPeriodDao testPeriodDao;
    @Autowired
    private TestTaskDtoConverter testTaskDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<TestTaskDto> getTestTasksByEmployeeId(Long employeeId) {
        List<TestTask> testTaskList = testTaskDao.getTestTasksByEmployeeId(employeeId);
        return testTaskDtoConverter.getDtoList(testTaskList);
    }

    @Override
    public TestTaskDto addTestTask(TestTaskDto testTaskDto) {
        TestPeriod lastTestPeriod = testPeriodDao.getLastTestPeriod();
        testTaskDto.setTestPeriodId(lastTestPeriod.getId());
        TestTask testTask = testTaskDtoConverter.getEntity(testTaskDto);
        TestTask addedTestTask = testTaskDao.addTestTask(testTask);
        return testTaskDtoConverter.getDto(addedTestTask);
    }

    @Override
    public void deleteTestTask(Long employeeId, Long testId) {
        TestTask.TestTaskPk testTaskPk = new TestTask.TestTaskPk();
        Employee employee = new Employee();
        employee.setId(employeeId);
        TestPeriod lastTestPeriod = testPeriodDao.getLastTestPeriod();
        Test test = new Test();
        test.setId(testId);
        testTaskPk.setEmployee(employee);
        testTaskPk.setTestPeriod(lastTestPeriod);
        testTaskPk.setTest(test);
        testTaskDao.deleteTestTaskByPk(testTaskPk);
    }
}
