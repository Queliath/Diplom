package by.bsuir.em.service.impl;

import by.bsuir.em.dto.AnswerOptionDto;
import by.bsuir.em.service.AnswerOptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerOptionServiceImpl implements AnswerOptionService {
    @Override
    public List<AnswerOptionDto> getAnswerOptionsByQuestionId(Long questionId) {
        return null;
    }
}
