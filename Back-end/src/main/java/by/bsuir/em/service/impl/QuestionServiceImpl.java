package by.bsuir.em.service.impl;

import by.bsuir.em.dao.QuestionDao;
import by.bsuir.em.dto.QuestionDto;
import by.bsuir.em.dto.converter.impl.QuestionDtoConverter;
import by.bsuir.em.entity.Question;
import by.bsuir.em.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private QuestionDtoConverter questionDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<QuestionDto> getQuestionsByTestId(Long testId) {
        List<Question> questionList = questionDao.getQuestionsByTestId(testId);
        return questionDtoConverter.getDtoList(questionList);
    }

    @Override
    @Transactional(readOnly = true)
    public QuestionDto getQuestionById(Long id) {
        Question question = questionDao.getQuestionById(id);
        return questionDtoConverter.getDto(question);
    }

    @Override
    public QuestionDto addQuestion(QuestionDto questionDto) {
        Question question = questionDtoConverter.getEntity(questionDto);
        Question addedQuestion = questionDao.addQuestion(question);
        return questionDtoConverter.getDto(addedQuestion);
    }
}
