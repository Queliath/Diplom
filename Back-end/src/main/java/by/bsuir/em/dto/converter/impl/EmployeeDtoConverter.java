package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.EmployeeDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDtoConverter implements DtoConverter<Employee, EmployeeDto> {
    @Override
    public EmployeeDto getDto(Employee entity) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(entity.getId());
        employeeDto.setFirstName(entity.getFirstName());
        employeeDto.setLastName(entity.getLastName());
        employeeDto.setBirthDate(entity.getBirthDate());
        employeeDto.setPosition(entity.getPosition());
        employeeDto.setCoreSkill(entity.getCoreSkill());

        return employeeDto;
    }

    @Override
    public Employee getEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setBirthDate(dto.getBirthDate());
        employee.setPosition(dto.getPosition());
        employee.setCoreSkill(dto.getCoreSkill());

        return employee;
    }

    @Override
    public List<EmployeeDto> getDtoList(List<Employee> entityList) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        for (Employee employee : entityList) {
            employeeDtoList.add(getDto(employee));
        }

        return employeeDtoList;
    }
}
