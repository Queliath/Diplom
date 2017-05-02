package by.bsuir.em.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "em_questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        return id != null && Objects.equals(id, question.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
