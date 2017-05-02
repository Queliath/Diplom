package by.bsuir.em.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "em_answer_options")
public class AnswerOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "value")
    private Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

        AnswerOption answerOption = (AnswerOption) o;

        return id != null && Objects.equals(id, answerOption.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
