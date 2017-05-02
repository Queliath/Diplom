package by.bsuir.em.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "em_test_results")
public class TestResult {
    @EmbeddedId
    private TestResultPk testResultPk = new TestResultPk();

    @Column(name = "success")
    private Float success;

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

        TestResult testResult = (TestResult) o;

        return testResultPk != null && Objects.equals(testResultPk, testResult.testResultPk);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Embeddable
    public class TestResultPk implements Serializable {
        @Column(name = "employee_id")
        private Long employeeId;

        @Column(name = "test_id")
        private Long testId;

        @Column(name = "test_period_id")
        private Long testPeriodId;

        public Long getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
        }

        public Long getTestId() {
            return testId;
        }

        public void setTestId(Long testId) {
            this.testId = testId;
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

            TestResultPk that = (TestResultPk) o;

            if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
            if (testId != null ? !testId.equals(that.testId) : that.testId != null) return false;
            return !(testPeriodId != null ? !testPeriodId.equals(that.testPeriodId) : that.testPeriodId != null);

        }

        @Override
        public int hashCode() {
            int result = employeeId != null ? employeeId.hashCode() : 0;
            result = 31 * result + (testId != null ? testId.hashCode() : 0);
            result = 31 * result + (testPeriodId != null ? testPeriodId.hashCode() : 0);
            return result;
        }
    }
}
