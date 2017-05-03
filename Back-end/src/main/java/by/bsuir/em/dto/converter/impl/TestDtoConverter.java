package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.TestDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Test;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestDtoConverter implements DtoConverter<Test, TestDto> {
    @Override
    public TestDto getDto(Test entity) {
        TestDto testDto = new TestDto();
        testDto.setId(entity.getId());
        testDto.setName(entity.getName());
        testDto.setFixedTime(entity.getFixedTime());
        testDto.setQuestionsCount(entity.getQuestionsCount());

        return testDto;
    }

    @Override
    public Test getEntity(TestDto dto) {
        Test test = new Test();
        test.setId(dto.getId());
        test.setName(dto.getName());
        test.setFixedTime(dto.getFixedTime());

        return test;
    }

    @Override
    public List<TestDto> getDtoList(List<Test> entityList) {
        List<TestDto> testDtoList = new ArrayList<>();
        for (Test test : entityList) {
            testDtoList.add(getDto(test));
        }

        return testDtoList;
    }
}
