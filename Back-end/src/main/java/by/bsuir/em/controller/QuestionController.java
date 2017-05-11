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

    @PostMapping
    public ResponseEntity<QuestionDto> addQuestion(@PathVariable Long testId, @RequestBody QuestionDto questionDto) {
        questionDto.setTestId(testId);
        QuestionDto addedQuestion = questionService.addQuestion(questionDto);
        return ResponseEntity.ok(addedQuestion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<QuestionDto> updateQuestion(@PathVariable Long testId, @PathVariable Long id, @RequestBody QuestionDto questionDto) {
        questionDto.setId(id);
        questionDto.setTestId(testId);
        QuestionDto updatedQuestion = questionService.updateQuestion(questionDto);
        return ResponseEntity.ok(updatedQuestion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }
}
