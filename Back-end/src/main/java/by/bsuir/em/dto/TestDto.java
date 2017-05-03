package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestDto extends Dto<Long> {
    private static final long serialVersionUID = -1093073555735822044L;

    private String name;
    private Long questionsCount;
    private Integer fixedTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Long questionsCount) {
        this.questionsCount = questionsCount;
    }

    public Integer getFixedTime() {
        return fixedTime;
    }

    public void setFixedTime(Integer fixedTime) {
        this.fixedTime = fixedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDto testDto = (TestDto) o;

        if (name != null ? !name.equals(testDto.name) : testDto.name != null) return false;
        if (questionsCount != null ? !questionsCount.equals(testDto.questionsCount) : testDto.questionsCount != null)
            return false;
        return !(fixedTime != null ? !fixedTime.equals(testDto.fixedTime) : testDto.fixedTime != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (questionsCount != null ? questionsCount.hashCode() : 0);
        result = 31 * result + (fixedTime != null ? fixedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "name='" + name + '\'' +
                ", questionsCount=" + questionsCount +
                ", fixedTime=" + fixedTime +
                '}';
    }
}
