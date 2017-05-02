package by.bsuir.em.dao;

import by.bsuir.em.entity.Question;

import java.util.List;

public interface QuestionDao {
    List<Question> getQuestionsByTestId(Long testId);
    Question getQuestionById(Long id);
}
