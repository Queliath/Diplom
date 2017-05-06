package by.bsuir.em.service;

import by.bsuir.em.dto.TestTaskDto;

import java.util.List;

public interface TestTaskService {
    List<TestTaskDto> getTestTasksByEmployeeId(Long employeeId);
    TestTaskDto addTestTask(TestTaskDto testTaskDto);
    void deleteTestTask(Long employeeId, Long testId);
}
