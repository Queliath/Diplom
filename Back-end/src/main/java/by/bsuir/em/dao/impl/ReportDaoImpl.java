package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.ReportDao;
import by.bsuir.em.entity.Report;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReportDaoImpl implements ReportDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Report> getReportsByEmployeeId(Long employeeId) {
        Query query = entityManager.createNativeQuery("select tps.id, tps.start_date, tps.end_date, trs.test_count, trs.average_success from " +
                "(select tr.test_period_id, count(tr.test_id) as test_count, avg(tr.success) as average_success from em_test_results tr where tr.employee_id = ? group by tr.test_period_id) trs " +
                "join (select tp.id, tp.start_date, tp.end_date from em_test_periods tp) tps on trs.test_period_id = tps.id");
        List resultSet = query.setParameter(1, employeeId).getResultList();

        List<Report> reportList = new ArrayList<>(resultSet.size());
        for (Object row : resultSet) {
            Object[] rowWithColumns = (Object[]) row;
            Long testPeriodId = ((BigInteger) rowWithColumns[0]).longValue();
            LocalDate testPeriodStartDate = ((Date) rowWithColumns[1]).toLocalDate();
            LocalDate testPeriodEndDate = ((Date) rowWithColumns[2]).toLocalDate();
            Long testCount = ((BigInteger) rowWithColumns[3]).longValue();
            Double averageSuccess = (Double) rowWithColumns[4];
            reportList.add(new Report(testPeriodId, testPeriodStartDate, testPeriodEndDate, testCount, averageSuccess));
        }

        return reportList;
    }

    @Override
    public Report getReportByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        TypedQuery<Object[]> query = entityManager.createQuery("select count(tr.testResultPk.test.id), avg(tr.success) " +
                "from TestResult tr where tr.testResultPk.employee.id = :employeeId and tr.testResultPk.testPeriod.id = :testPeriodId", Object[].class);
        List<Object[]> resultSet = query.setParameter("employeeId", employeeId).setParameter("testPeriodId", testPeriodId).getResultList();

        if (resultSet.isEmpty()) {
            return null;
        }
        Object[] row = resultSet.get(0);
        return new Report((Long) row[0], (Double) row[1]);
    }
}
