package by.bsuir.em.entity;

public class Report {
    private Long testPeriodId;
    private Long testCount;
    private Float averageSuccess;

    public Report() {
    }

    public Report(Long testCount, Float averageSuccess) {
        this.testCount = testCount;
        this.averageSuccess = averageSuccess;
    }

    public Report(Long testPeriodId, Long testCount, Float averageSuccess) {
        this.testPeriodId = testPeriodId;
        this.testCount = testCount;
        this.averageSuccess = averageSuccess;
    }

    public Long getTestPeriodId() {
        return testPeriodId;
    }

    public void setTestPeriodId(Long testPeriodId) {
        this.testPeriodId = testPeriodId;
    }

    public Long getTestCount() {
        return testCount;
    }

    public void setTestCount(Long testCount) {
        this.testCount = testCount;
    }

    public Float getAverageSuccess() {
        return averageSuccess;
    }

    public void setAverageSuccess(Float averageSuccess) {
        this.averageSuccess = averageSuccess;
    }
}
