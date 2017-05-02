package by.bsuir.em.service.impl;

import by.bsuir.em.dao.ReportDao;
import by.bsuir.em.dto.ReportDto;
import by.bsuir.em.dto.converter.impl.ReportDtoConverter;
import by.bsuir.em.entity.Report;
import by.bsuir.em.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportDao reportDao;
    @Autowired
    private ReportDtoConverter reportDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<ReportDto> getReportsByEmployeeId(Long employeeId) {
        List<Report> reportList = reportDao.getReportsByEmployeeId(employeeId);
        return reportDtoConverter.getDtoList(reportList);
    }

    @Override
    @Transactional(readOnly = true)
    public ReportDto getReportByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        Report report = reportDao.getReportByEmployeeIdAndTestPeriodId(employeeId, testPeriodId);
        return reportDtoConverter.getDto(report);
    }
}
