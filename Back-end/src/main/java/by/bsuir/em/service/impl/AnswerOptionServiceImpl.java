package by.bsuir.em.service.impl;

import by.bsuir.em.dto.AnswerOptionDto;
import by.bsuir.em.service.AnswerOptionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerOptionServiceImpl implements AnswerOptionService {
    @Override
    public List<AnswerOptionDto> getAnswerOptionsByQuestionId(Long questionId) {
        List<AnswerOptionDto> answerOptionDtoList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            AnswerOptionDto answerOptionDto = new AnswerOptionDto();
            answerOptionDto.setId((long) i + 1);
            answerOptionDto.setContent("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.");
            answerOptionDto.setValue(3);

            answerOptionDtoList.add(answerOptionDto);
        }

        return answerOptionDtoList;
    }
}
