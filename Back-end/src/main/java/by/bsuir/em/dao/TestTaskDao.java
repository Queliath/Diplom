package by.bsuir.em.dao;

import by.bsuir.em.entity.TestTask;

import java.util.List;

public interface TestTaskDao {
    List<TestTask> getTestTasksByEmployeeId(Long employeeId);
    void deleteTestTaskByPk(TestTask.TestTaskPk pk);
}
