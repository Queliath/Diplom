package by.bsuir.em.service.impl;

import by.bsuir.em.dao.AnswerOptionDao;
import by.bsuir.em.dto.AnswerOptionDto;
import by.bsuir.em.dto.converter.impl.AnswerOptionDtoConverter;
import by.bsuir.em.entity.AnswerOption;
import by.bsuir.em.service.AnswerOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnswerOptionServiceImpl implements AnswerOptionService {
    @Autowired
    private AnswerOptionDao answerOptionDao;
    @Autowired
    private AnswerOptionDtoConverter answerOptionDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<AnswerOptionDto> getAnswerOptionsByQuestionId(Long questionId) {
        List<AnswerOption> answerOptionList = answerOptionDao.getAnswerOptionsByQuestionId(questionId);
        return answerOptionDtoConverter.getDtoList(answerOptionList);
    }
}
