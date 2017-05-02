package by.bsuir.em.service.impl;

import by.bsuir.em.dto.ReportDto;
import by.bsuir.em.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Override
    public List<ReportDto> getReportsByEmployeeId(Long employeeId) {
        return null;
    }

    @Override
    public ReportDto getReportByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        return null;
    }
}
