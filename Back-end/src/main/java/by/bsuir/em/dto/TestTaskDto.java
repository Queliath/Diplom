package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestTaskDto implements Serializable {
    private Long testId;
    private String testName;
    private Integer fixedTime;
    private Long testPeriodId;

    private Long employeeId;

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getFixedTime() {
        return fixedTime;
    }

    public void setFixedTime(Integer fixedTime) {
        this.fixedTime = fixedTime;
    }

    public Long getTestPeriodId() {
        return testPeriodId;
    }

    public void setTestPeriodId(Long testPeriodId) {
        this.testPeriodId = testPeriodId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestTaskDto that = (TestTaskDto) o;

        if (testId != null ? !testId.equals(that.testId) : that.testId != null) return false;
        if (testName != null ? !testName.equals(that.testName) : that.testName != null) return false;
        return !(fixedTime != null ? !fixedTime.equals(that.fixedTime) : that.fixedTime != null);

    }

    @Override
    public int hashCode() {
        int result = testId != null ? testId.hashCode() : 0;
        result = 31 * result + (testName != null ? testName.hashCode() : 0);
        result = 31 * result + (fixedTime != null ? fixedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestTaskDto{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", fixedTime=" + fixedTime +
                '}';
    }
}
