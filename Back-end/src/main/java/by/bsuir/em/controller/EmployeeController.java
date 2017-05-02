package by.bsuir.em.controller;

import by.bsuir.em.dto.EmployeeDto;
import by.bsuir.em.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(params = {"projectId"})
    public ResponseEntity<List<EmployeeDto>> getEmployeesByProjectId(@RequestParam Long projectId) {
        List<EmployeeDto> employeeDtoList = employeeService.getEmployeesByProjectId(projectId);
        return ResponseEntity.ok(employeeDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }
}
