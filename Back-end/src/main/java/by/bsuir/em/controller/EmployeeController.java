package by.bsuir.em.controller;

import by.bsuir.em.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping(params = {"projectId"})
    public ResponseEntity<List<EmployeeDto>> getEmployeesByProjectId(@RequestParam Long projectId) {
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

        return ResponseEntity.ok(employeeDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(id);
        employeeDto.setFirstName("Doris");
        employeeDto.setLastName("Evans");
        employeeDto.setBirthDate(LocalDate.now());
        employeeDto.setPosition("Senior Software Engineer");
        employeeDto.setExperience(5);
        employeeDto.setCoreSkill("Java");

        return ResponseEntity.ok(employeeDto);
    }
}
