package by.bsuir.em.service.impl;

import by.bsuir.em.dto.QuestionDto;
import by.bsuir.em.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Override
    public List<QuestionDto> getQuestionsByTestId(Long testId) {
        List<QuestionDto> questionDtoList = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            QuestionDto questionDto = new QuestionDto();
            questionDto.setId((long) i + 1);
            questionDto.setContent("Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.");

            questionDtoList.add(questionDto);
        }

        return questionDtoList;
    }

    @Override
    public QuestionDto getQuestionById(Long id) {
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(id);
        questionDto.setContent("Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.");

        return questionDto;
    }
}
