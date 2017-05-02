package by.bsuir.em.controller;

import by.bsuir.em.dto.QuestionDto;
import by.bsuir.em.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tests/{testId}/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping
    public ResponseEntity<List<QuestionDto>> getQuestionsByTestId(@PathVariable Long testId) {
        List<QuestionDto> questionDtoList = questionService.getQuestionsByTestId(testId);
        return ResponseEntity.ok(questionDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuestionDto> getQuestionById(@PathVariable Long id) {
        QuestionDto questionDto = questionService.getQuestionById(id);
        return ResponseEntity.ok(questionDto);
    }
}
