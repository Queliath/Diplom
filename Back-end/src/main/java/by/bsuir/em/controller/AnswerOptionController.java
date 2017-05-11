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
    private AnswerOptionService answerOptionService;

    @GetMapping
    public ResponseEntity<List<AnswerOptionDto>> getAnswerOptionsByQuestionId(@PathVariable Long questionId) {
        List<AnswerOptionDto> answerOptionDtoList = answerOptionService.getAnswerOptionsByQuestionId(questionId);
        return ResponseEntity.ok(answerOptionDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnswerOptionDto> getAnswerOptionById(@PathVariable Long id) {
        AnswerOptionDto answerOptionDto = answerOptionService.getAnswerOptionById(id);
        return ResponseEntity.ok(answerOptionDto);
    }

    @PostMapping
    public ResponseEntity<AnswerOptionDto> addAnswerOption(@PathVariable Long questionId, @RequestBody AnswerOptionDto answerOptionDto) {
        answerOptionDto.setQuestionId(questionId);
        AnswerOptionDto addedAnswerOption = answerOptionService.addAnswerOption(answerOptionDto);
        return ResponseEntity.ok(addedAnswerOption);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnswerOptionDto> updateAnswerOption(@PathVariable Long questionId, @PathVariable Long id, @RequestBody AnswerOptionDto answerOptionDto) {
        answerOptionDto.setQuestionId(questionId);
        answerOptionDto.setId(id);
        AnswerOptionDto updatedAnswerOption = answerOptionService.updateAnswerOption(answerOptionDto);
        return ResponseEntity.ok(updatedAnswerOption);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnswerOption(@PathVariable Long id) {
        answerOptionService.deleteAnswerOption(id);
        return ResponseEntity.noContent().build();
    }
}
