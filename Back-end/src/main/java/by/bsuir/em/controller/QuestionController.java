package by.bsuir.em.controller;

import by.bsuir.em.dto.QuestionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tests/{testId}/questions")
public class QuestionController {

    @GetMapping
    public ResponseEntity<List<QuestionDto>> getQuestionsByTestId(@PathVariable Long testId) {
        List<QuestionDto> questionDtoList = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            QuestionDto questionDto = new QuestionDto();
            questionDto.setId((long) i + 1);
            questionDto.setContent("Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.");

            questionDtoList.add(questionDto);
        }

        return ResponseEntity.ok(questionDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuestionDto> getQuestionById(@PathVariable Long id) {
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(id);
        questionDto.setContent("Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.");

        return ResponseEntity.ok(questionDto);
    }
}
