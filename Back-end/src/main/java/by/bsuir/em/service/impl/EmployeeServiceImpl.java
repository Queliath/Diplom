package by.bsuir.em.service.impl;

import by.bsuir.em.dto.EmployeeDto;
import by.bsuir.em.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<EmployeeDto> getEmployeesByProjectId(Long projectId) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId((long) i + 1);
            employeeDto.setFirstName("Doris");
            employeeDto.setLastName("Evans");
            employeeDto.setBirthDate(LocalDate.now());
            employeeDto.setPosition("Senior Software Engineer");
            employeeDto.setExperience(5);
            employeeDto.setCoreSkill("Java");

            employeeDtoList.add(employeeDto);
        }

        return employeeDtoList;
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(id);
        employeeDto.setFirstName("Doris");
        employeeDto.setLastName("Evans");
        employeeDto.setBirthDate(LocalDate.now());
        employeeDto.setPosition("Senior Software Engineer");
        employeeDto.setExperience(5);
        employeeDto.setCoreSkill("Java");

        return employeeDto;
    }
}
