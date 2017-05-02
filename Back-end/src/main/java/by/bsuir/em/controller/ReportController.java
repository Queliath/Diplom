package by.bsuir.em.controller;

import by.bsuir.em.dto.ReportDto;
import by.bsuir.em.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees/{employeeId}/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity<List<ReportDto>> getReportsByEmployeeId(@PathVariable Long employeeId) {
        List<ReportDto> reportDtoList = reportService.getReportsByEmployeeId(employeeId);
        return ResponseEntity.ok(reportDtoList);
    }

    @GetMapping("/{testPeriodId}")
    public ResponseEntity<ReportDto> getReportByEmployeeIdAndTestPeriodId(
            @PathVariable Long employeeId, @PathVariable Long testPeriodId) {
        ReportDto reportDto = reportService.getReportByEmployeeIdAndTestPeriodId(employeeId, testPeriodId);
        return ResponseEntity.ok(reportDto);
    }
}
