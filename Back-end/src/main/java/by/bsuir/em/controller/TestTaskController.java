package by.bsuir.em.controller;

import by.bsuir.em.dto.TestTaskDto;
import by.bsuir.em.service.TestTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees/{employeeId}/tasks")
public class TestTaskController {
    @Autowired
    private TestTaskService testTaskService;

    @GetMapping
    public ResponseEntity<List<TestTaskDto>> getTestTasksByEmployeeId(@PathVariable Long employeeId) {
        List<TestTaskDto> testTaskDtoList = testTaskService.getTestTasksByEmployeeId(employeeId);
        return ResponseEntity.ok(testTaskDtoList);
    }

    @PostMapping
    public ResponseEntity<TestTaskDto> addTestTask(@PathVariable Long employeeId, @RequestBody TestTaskDto testTaskDto) {
        testTaskDto.setEmployeeId(employeeId);
        TestTaskDto addedTestTask = testTaskService.addTestTask(testTaskDto);
        return ResponseEntity.ok(addedTestTask);
    }
}
