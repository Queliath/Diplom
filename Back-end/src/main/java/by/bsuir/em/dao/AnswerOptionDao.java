package by.bsuir.em.dao;

import by.bsuir.em.entity.AnswerOption;

import java.util.List;

public interface AnswerOptionDao {
    List<AnswerOption> getAnswerOptionsByQuestionId(Long questionId);
}
