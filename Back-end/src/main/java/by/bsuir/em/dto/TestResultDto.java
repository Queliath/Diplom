package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestResultDto implements Serializable {
    private static final long serialVersionUID = -1093073555735822044L;

    private Long testId;
    private String testName;
    private Integer fixedTime;
    private Double success;
    private Map<Long, Long> answers;

    private Long employeeId;
    private Long testPeriodId;

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

    public Double getSuccess() {
        return success;
    }

    public void setSuccess(Double success) {
        this.success = success;
    }

    public Map<Long, Long> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Long, Long> answers) {
        this.answers = answers;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getTestPeriodId() {
        return testPeriodId;
    }

    public void setTestPeriodId(Long testPeriodId) {
        this.testPeriodId = testPeriodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestResultDto that = (TestResultDto) o;

        if (testName != null ? !testName.equals(that.testName) : that.testName != null) return false;
        return !(success != null ? !success.equals(that.success) : that.success != null);

    }

    @Override
    public int hashCode() {
        int result = testName != null ? testName.hashCode() : 0;
        result = 31 * result + (success != null ? success.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestResultDto{" +
                "testName='" + testName + '\'' +
                ", success=" + success +
                '}';
    }
}
