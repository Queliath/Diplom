package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestResultDto {
    private static final long serialVersionUID = -1093073555735822044L;

    private String testName;
    private Float success;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Float getSuccess() {
        return success;
    }

    public void setSuccess(Float success) {
        this.success = success;
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
