package by.bsuir.em.dao;

import by.bsuir.em.entity.Report;

import java.util.List;

public interface ReportDao {
    List<Report> getReportsByEmployeeId(Long employeeId);
    Report getReportByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId);
}
