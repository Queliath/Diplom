package by.bsuir.em.controller;

import by.bsuir.em.dto.TestResultDto;
import by.bsuir.em.service.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees/{employeeId}/reports/{testPeriodId}/results")
public class TestResultsController {
    @Autowired
    TestResultService testResultService;

    @GetMapping
    public ResponseEntity<List<TestResultDto>> getTestResultsByEmployeeIdAndTestPeriodId(
            @PathVariable Long employeeId, @PathVariable Long testPeriodId) {
        List<TestResultDto> testResultDtoList = testResultService.getTestResultsByEmployeeIdAndTestPeriodId(employeeId, testPeriodId);
        return ResponseEntity.ok(testResultDtoList);
    }
}
