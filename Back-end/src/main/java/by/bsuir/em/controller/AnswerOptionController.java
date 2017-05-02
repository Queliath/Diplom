package by.bsuir.em.controller;

import by.bsuir.em.dto.AnswerOptionDto;
import by.bsuir.em.service.AnswerOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/questions/{questionId}/options")
public class AnswerOptionController {
    @Autowired
    AnswerOptionService answerOptionService;

    @GetMapping
    public ResponseEntity<List<AnswerOptionDto>> getAnswerOptionsByQuestionId(@PathVariable Long questionId) {
        List<AnswerOptionDto> answerOptionDtoList = answerOptionService.getAnswerOptionsByQuestionId(questionId);
        return ResponseEntity.ok(answerOptionDtoList);
    }
}
