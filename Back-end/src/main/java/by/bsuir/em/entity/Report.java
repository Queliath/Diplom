package by.bsuir.em.entity;

import java.time.LocalDate;

public class Report {
    private Long testPeriodId;
    private LocalDate testPeriodStartDate;
    private LocalDate testPeriodEndDate;
    private Long testCount;
    private Double averageSuccess;

    public Report() {
    }

    public Report(Long testCount, Double averageSuccess) {
        this.testCount = testCount;
        this.averageSuccess = averageSuccess;
    }

    public Report(Long testPeriodId, LocalDate testPeriodStartDate, LocalDate testPeriodEndDate, Long testCount, Double averageSuccess) {
        this.testPeriodId = testPeriodId;
        this.testPeriodStartDate = testPeriodStartDate;
        this.testPeriodEndDate = testPeriodEndDate;
        this.testCount = testCount;
        this.averageSuccess = averageSuccess;
    }

    public Long getTestPeriodId() {
        return testPeriodId;
    }

    public void setTestPeriodId(Long testPeriodId) {
        this.testPeriodId = testPeriodId;
    }

    public LocalDate getTestPeriodStartDate() {
        return testPeriodStartDate;
    }

    public void setTestPeriodStartDate(LocalDate testPeriodStartDate) {
        this.testPeriodStartDate = testPeriodStartDate;
    }

    public LocalDate getTestPeriodEndDate() {
        return testPeriodEndDate;
    }

    public void setTestPeriodEndDate(LocalDate testPeriodEndDate) {
        this.testPeriodEndDate = testPeriodEndDate;
    }

    public Long getTestCount() {
        return testCount;
    }

    public void setTestCount(Long testCount) {
        this.testCount = testCount;
    }

    public Double getAverageSuccess() {
        return averageSuccess;
    }

    public void setAverageSuccess(Double averageSuccess) {
        this.averageSuccess = averageSuccess;
    }
}
