package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.TestTaskDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Employee;
import by.bsuir.em.entity.Test;
import by.bsuir.em.entity.TestPeriod;
import by.bsuir.em.entity.TestTask;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestTaskDtoConverter implements DtoConverter<TestTask, TestTaskDto> {
    @Override
    public TestTaskDto getDto(TestTask entity) {
        TestTaskDto testTaskDto = new TestTaskDto();
        testTaskDto.setTestId(entity.getTestTaskPk().getTest().getId());
        testTaskDto.setTestName(entity.getTestTaskPk().getTest().getName());
        testTaskDto.setFixedTime(entity.getTestTaskPk().getTest().getFixedTime());
        testTaskDto.setTestPeriodId(entity.getTestTaskPk().getTestPeriod().getId());

        return testTaskDto;
    }

    @Override
    public TestTask getEntity(TestTaskDto dto) {
        TestTask testTask = new TestTask();
        TestTask.TestTaskPk testTaskPk = new TestTask.TestTaskPk();
        Employee employee = new Employee();
        employee.setId(dto.getEmployeeId());
        TestPeriod testPeriod = new TestPeriod();
        testPeriod.setId(dto.getTestPeriodId());
        Test test = new Test();
        test.setId(dto.getTestId());
        testTaskPk.setEmployee(employee);
        testTaskPk.setTestPeriod(testPeriod);
        testTaskPk.setTest(test);
        testTask.setTestTaskPk(testTaskPk);

        return testTask;
    }

    @Override
    public List<TestTaskDto> getDtoList(List<TestTask> entityList) {
        List<TestTaskDto> testTaskDtoList = new ArrayList<>(entityList.size());
        for (TestTask testTask : entityList) {
            testTaskDtoList.add(getDto(testTask));
        }

        return testTaskDtoList;
    }
}
