package by.bsuir.em.service;

import by.bsuir.em.dto.AnswerOptionDto;

import java.util.List;

public interface AnswerOptionService {
    List<AnswerOptionDto> getAnswerOptionsByQuestionId(Long questionId);
    AnswerOptionDto getAnswerOptionById(Long id);
    AnswerOptionDto addAnswerOption(AnswerOptionDto answerOptionDto);
    AnswerOptionDto updateAnswerOption(AnswerOptionDto answerOptionDto);
    void deleteAnswerOption(Long id);
}
