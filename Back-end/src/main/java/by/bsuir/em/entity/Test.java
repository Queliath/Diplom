package by.bsuir.em.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "em_tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "fixed_time")
    private Integer fixedTime;

    @OneToMany(mappedBy = "test")
    private Set<Question> questions;

    @OneToMany(mappedBy = "testResultPk.test")
    private Set<TestResult> testResults;

    @OneToMany(mappedBy = "testTaskPk.test")
    private Set<TestTask> testTasks;

    @Transient
    private Long questionsCount;

    public Test() {
    }

    public Test(Long id, Long questionsCount) {
        this.id = id;
        this.questionsCount = questionsCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFixedTime() {
        return fixedTime;
    }

    public void setFixedTime(Integer fixedTime) {
        this.fixedTime = fixedTime;
    }

    public Long getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Long questionsCount) {
        this.questionsCount = questionsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        return id != null && Objects.equals(id, test.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
