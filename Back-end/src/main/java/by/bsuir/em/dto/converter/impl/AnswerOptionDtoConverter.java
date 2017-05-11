package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.AnswerOptionDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.AnswerOption;
import by.bsuir.em.entity.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnswerOptionDtoConverter implements DtoConverter<AnswerOption, AnswerOptionDto> {
    @Override
    public AnswerOptionDto getDto(AnswerOption entity) {
        AnswerOptionDto answerOptionDto = new AnswerOptionDto();
        answerOptionDto.setId(entity.getId());
        answerOptionDto.setContent(entity.getContent());
        answerOptionDto.setValue(entity.getValue());

        return answerOptionDto;
    }

    @Override
    public AnswerOption getEntity(AnswerOptionDto dto) {
        AnswerOption answerOption = new AnswerOption();
        answerOption.setId(dto.getId());
        answerOption.setContent(dto.getContent());
        answerOption.setValue(dto.getValue());
        Question question = new Question();
        question.setId(dto.getQuestionId());
        answerOption.setQuestion(question);

        return answerOption;
    }

    @Override
    public List<AnswerOptionDto> getDtoList(List<AnswerOption> entityList) {
        List<AnswerOptionDto> answerOptionDtoList = new ArrayList<>();
        for (AnswerOption answerOption : entityList) {
            answerOptionDtoList.add(getDto(answerOption));
        }

        return answerOptionDtoList;
    }
}
