package by.bsuir.em.service.impl;

import by.bsuir.em.dto.TestDto;
import by.bsuir.em.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public List<TestDto> getTests() {
        return null;
    }

    @Override
    public TestDto getTestById(Long id) {
        return null;
    }
}
