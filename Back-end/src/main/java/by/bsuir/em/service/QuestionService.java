package by.bsuir.em.service;

import by.bsuir.em.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getQuestionsByTestId(Long testId);
    QuestionDto getQuestionById(Long id);
    QuestionDto addQuestion(QuestionDto questionDto);
}
