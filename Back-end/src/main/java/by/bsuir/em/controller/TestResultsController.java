package by.bsuir.em.controller;

import by.bsuir.em.dto.TestResultDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees/{employeeId}/reports/{testPeriodId}/results")
public class TestResultsController {

    @GetMapping
    public ResponseEntity<List<TestResultDto>> getTestResultsByEmployeeIdAndTestPeriodId(
            @PathVariable Long employeeId, @PathVariable Long testPeriodId) {
        List<TestResultDto> testResultDtoList = new ArrayList<>(12);
        for (int i = 0; i < 12; i++) {
            TestResultDto testResultDto = new TestResultDto();
            testResultDto.setTestName("Triple-buffered actuating benchmark");
            testResultDto.setSuccess(91.1F);

            testResultDtoList.add(testResultDto);
        }

        return ResponseEntity.ok(testResultDtoList);
    }
}
