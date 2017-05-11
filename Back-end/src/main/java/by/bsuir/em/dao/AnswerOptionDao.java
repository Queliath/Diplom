package by.bsuir.em.dao;

import by.bsuir.em.entity.AnswerOption;

import java.util.List;

public interface AnswerOptionDao {
    List<AnswerOption> getAnswerOptionsByQuestionId(Long questionId);
    AnswerOption getAnswerOptionById(Long id);
    AnswerOption addAnswerOption(AnswerOption answerOption);
    AnswerOption updateAnswerOption(AnswerOption answerOption);
    void deleteAnswerOption(Long id);
}
