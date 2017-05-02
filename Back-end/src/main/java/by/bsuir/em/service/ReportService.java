package by.bsuir.em.service;

import by.bsuir.em.dto.ReportDto;

import java.util.List;

public interface ReportService {
    List<ReportDto> getReportsByEmployeeId(Long employeeId);
    ReportDto getReportByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId);
}
