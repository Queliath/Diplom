package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnswerOptionDto extends Dto<Long> {
    private static final long serialVersionUID = -1093073555735822044L;

    private String content;
    private Integer value;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswerOptionDto that = (AnswerOptionDto) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        return !(value != null ? !value.equals(that.value) : that.value != null);

    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AnswerOptionDto{" +
                "content='" + content + '\'' +
                ", value=" + value +
                '}';
    }
}
