package by.bsuir.em.service.impl;

import by.bsuir.em.dao.TestTaskDao;
import by.bsuir.em.dto.TestTaskDto;
import by.bsuir.em.dto.converter.impl.TestTaskDtoConverter;
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
    private TestTaskDtoConverter testTaskDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<TestTaskDto> getTestTasksByEmployeeId(Long employeeId) {
        List<TestTask> testTaskList = testTaskDao.getTestTasksByEmployeeId(employeeId);
        return testTaskDtoConverter.getDtoList(testTaskList);
    }
}
