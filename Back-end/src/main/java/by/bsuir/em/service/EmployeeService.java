package by.bsuir.em.service;

import by.bsuir.em.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getEmployeesByProjectId(Long projectId);
    EmployeeDto getEmployeeById(Long id);
}
