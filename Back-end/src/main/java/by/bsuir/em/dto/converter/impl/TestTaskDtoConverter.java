package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.TestTaskDto;
import by.bsuir.em.dto.converter.DtoConverter;
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
        return null;
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
