package by.bsuir.em.service.impl;

import by.bsuir.em.dto.EmployeeDto;
import by.bsuir.em.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<EmployeeDto> getEmployeesByProjectId(Long projectId) {
        return null;
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return null;
    }
}
