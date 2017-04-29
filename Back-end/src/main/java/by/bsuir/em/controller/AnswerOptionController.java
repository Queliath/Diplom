package by.bsuir.em.controller;

import by.bsuir.em.dto.AnswerOptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/questions/{questionId}/options")
public class AnswerOptionController {

    @GetMapping
    public ResponseEntity<List<AnswerOptionDto>> getAnswerOptionsByQuestionId(@PathVariable Long questionId) {
        List<AnswerOptionDto> answerOptionDtoList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            AnswerOptionDto answerOptionDto = new AnswerOptionDto();
            answerOptionDto.setId((long) i + 1);
            answerOptionDto.setContent("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.");
            answerOptionDto.setValue(3);

            answerOptionDtoList.add(answerOptionDto);
        }

        return ResponseEntity.ok(answerOptionDtoList);
    }
}
