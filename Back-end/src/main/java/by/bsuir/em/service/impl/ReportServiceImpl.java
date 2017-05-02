package by.bsuir.em.service.impl;

import by.bsuir.em.dto.ReportDto;
import by.bsuir.em.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Override
    public List<ReportDto> getReportsByEmployeeId(Long employeeId) {
        List<ReportDto> reportDtoList = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            ReportDto reportDto = new ReportDto();
            reportDto.setTestPeriodId((long) i + 1);
            reportDto.setTestCount(10);
            reportDto.setAverageSuccess(86.3F);

            reportDtoList.add(reportDto);
        }

        return reportDtoList;
    }

    @Override
    public ReportDto getReportByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        ReportDto reportDto = new ReportDto();
        reportDto.setTestPeriodId(testPeriodId);
        reportDto.setTestCount(10);
        reportDto.setAverageSuccess(86.3F);

        return reportDto;
    }
}
