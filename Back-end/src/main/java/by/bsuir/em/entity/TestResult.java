package by.bsuir.em.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "em_test_results")
public class TestResult {
    @EmbeddedId
    private TestResultPk testResultPk;

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
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "employee_id")
        private Employee employee;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "test_id")
        private Test test;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "test_period_id")
        private TestPeriod testPeriod;

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public Test getTest() {
            return test;
        }

        public void setTest(Test test) {
            this.test = test;
        }

        public TestPeriod getTestPeriod() {
            return testPeriod;
        }

        public void setTestPeriod(TestPeriod testPeriod) {
            this.testPeriod = testPeriod;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TestResultPk that = (TestResultPk) o;

            if (employee != null ? !employee.equals(that.employee) : that.employee != null) return false;
            if (test != null ? !test.equals(that.test) : that.test != null) return false;
            return !(testPeriod != null ? !testPeriod.equals(that.testPeriod) : that.testPeriod != null);
        }

        @Override
        public int hashCode() {
            int result = employee != null ? employee.hashCode() : 0;
            result = 31 * result + (test != null ? test.hashCode() : 0);
            result = 31 * result + (testPeriod != null ? testPeriod.hashCode() : 0);
            return result;
        }
    }
}
