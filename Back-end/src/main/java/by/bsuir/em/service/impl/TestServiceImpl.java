package by.bsuir.em.service.impl;

import by.bsuir.em.dao.TestDao;
import by.bsuir.em.dto.TestDto;
import by.bsuir.em.dto.converter.impl.TestDtoConverter;
import by.bsuir.em.entity.Test;
import by.bsuir.em.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Autowired
    private TestDtoConverter testDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<TestDto> getTests() {
        List<Test> testList = testDao.getTests();
        return testDtoConverter.getDtoList(testList);
    }

    @Override
    @Transactional(readOnly = true)
    public TestDto getTestById(Long id) {
        Test test = testDao.getTestById(id);
        return testDtoConverter.getDto(test);
    }
}
