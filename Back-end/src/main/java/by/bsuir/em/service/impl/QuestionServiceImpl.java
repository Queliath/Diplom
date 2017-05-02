package by.bsuir.em.service.impl;

import by.bsuir.em.dto.QuestionDto;
import by.bsuir.em.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Override
    public List<QuestionDto> getQuestionsByTestId(Long testId) {
        return null;
    }

    @Override
    public QuestionDto getQuestionById(Long id) {
        return null;
    }
}
