package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportDto implements Serializable {
    private static final long serialVersionUID = -1093073555735822044L;

    private Long testPeriodId;
    private LocalDate testPeriodStartDate;
    private LocalDate testPeriodEndDate;
    private Long testCount;
    private Double averageSuccess;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportDto reportDto = (ReportDto) o;

        if (testPeriodId != null ? !testPeriodId.equals(reportDto.testPeriodId) : reportDto.testPeriodId != null)
            return false;
        if (testCount != null ? !testCount.equals(reportDto.testCount) : reportDto.testCount != null) return false;
        return !(averageSuccess != null ? !averageSuccess.equals(reportDto.averageSuccess) : reportDto.averageSuccess != null);

    }

    @Override
    public int hashCode() {
        int result = testPeriodId != null ? testPeriodId.hashCode() : 0;
        result = 31 * result + (testCount != null ? testCount.hashCode() : 0);
        result = 31 * result + (averageSuccess != null ? averageSuccess.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "testPeriodId=" + testPeriodId +
                ", testCount=" + testCount +
                ", averageSuccess=" + averageSuccess +
                '}';
    }
}
