package by.bsuir.em.controller;

import by.bsuir.em.dto.ReportDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees/{employeeId}/reports")
public class ReportController {

    @GetMapping
    public ResponseEntity<List<ReportDto>> getReportsByEmployeeId(@PathVariable Long employeeId) {
        List<ReportDto> reportDtoList = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            ReportDto reportDto = new ReportDto();
            reportDto.setTestPeriodId((long) i + 1);
            reportDto.setTestCount(10);
            reportDto.setAverageSuccess(86.3F);

            reportDtoList.add(reportDto);
        }

        return ResponseEntity.ok(reportDtoList);
    }
}
