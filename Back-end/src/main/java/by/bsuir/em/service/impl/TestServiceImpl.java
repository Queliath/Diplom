package by.bsuir.em.service.impl;

import by.bsuir.em.dto.TestDto;
import by.bsuir.em.service.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public List<TestDto> getTests() {
        List<TestDto> testDtoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            TestDto testDto = new TestDto();
            testDto.setId((long) i + 1);
            testDto.setName("Managed background approach");
            testDto.setQuestionsCount(15);
            testDto.setFixedTime(30);

            testDtoList.add(testDto);
        }

        return testDtoList;
    }

    @Override
    public TestDto getTestById(Long id) {
        TestDto testDto = new TestDto();
        testDto.setId(id);
        testDto.setName("Managed background approach");
        testDto.setQuestionsCount(15);
        testDto.setFixedTime(30);

        return testDto;
    }
}
