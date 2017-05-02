package by.bsuir.em.service;

import by.bsuir.em.dto.TestDto;

import java.util.List;

public interface TestService {
    List<TestDto> getTests();
    TestDto getTestById(Long id);
}
