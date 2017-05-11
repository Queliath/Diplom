package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.QuestionDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Question;
import by.bsuir.em.entity.Test;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionDtoConverter implements DtoConverter<Question, QuestionDto> {
    @Override
    public QuestionDto getDto(Question entity) {
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(entity.getId());
        questionDto.setContent(entity.getContent());

        return questionDto;
    }

    @Override
    public Question getEntity(QuestionDto dto) {
        Question question = new Question();
        question.setId(dto.getId());
        question.setContent(dto.getContent());
        Test test = new Test();
        test.setId(dto.getTestId());
        question.setTest(test);

        return question;
    }

    @Override
    public List<QuestionDto> getDtoList(List<Question> entityList) {
        List<QuestionDto> questionDtoList = new ArrayList<>();
        for (Question question : entityList) {
            questionDtoList.add(getDto(question));
        }

        return questionDtoList;
    }
}
