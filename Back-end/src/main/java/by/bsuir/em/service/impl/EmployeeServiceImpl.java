package by.bsuir.em.service.impl;

import by.bsuir.em.dao.EmployeeDao;
import by.bsuir.em.dto.EmployeeDto;
import by.bsuir.em.dto.converter.impl.EmployeeDtoConverter;
import by.bsuir.em.entity.Employee;
import by.bsuir.em.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeDtoConverter employeeDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getEmployeesByProjectId(Long projectId) {
        List<Employee> employeeList = employeeDao.getEmployeesByProjectId(projectId);
        return employeeDtoConverter.getDtoList(employeeList);
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeDao.getEmployeeById(id);
        return employeeDtoConverter.getDto(employee);
    }
}
