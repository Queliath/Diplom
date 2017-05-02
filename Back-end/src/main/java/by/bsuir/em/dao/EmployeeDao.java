package by.bsuir.em.dao;

import by.bsuir.em.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getEmployeesByProjectId(Long projectId);
    Employee getEmployeeById(Long id);
}
