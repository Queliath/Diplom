package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.ReportDao;
import by.bsuir.em.entity.Report;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReportDaoImpl implements ReportDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Report> getReportsByEmployeeId(Long employeeId) {
        TypedQuery<Object[]> query = entityManager.createQuery("select tr.testResultPk.testPeriod.id, count(tr.testResultPk.test.id), avg(tr.success) " +
                "from TestResult tr where tr.testResultPk.employee.id = :employeeId group by tr.testResultPk.testPeriod.id", Object[].class);
        List<Object[]> resultSet = query.setParameter("employeeId", employeeId).getResultList();

        List<Report> reportList = new ArrayList<>(resultSet.size());
        for (Object[] row : resultSet) {
            reportList.add(new Report((Long) row[0], (Long) row[1], (Double) row[2]));
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
