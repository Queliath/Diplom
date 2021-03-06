package by.bsuir.em.controller;

import by.bsuir.em.dto.TestDto;
import by.bsuir.em.entity.Test;
import by.bsuir.em.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tests")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping
    public ResponseEntity<List<TestDto>> getTests() {
        List<TestDto> testDtoList = testService.getTests();
        return ResponseEntity.ok(testDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestDto> getTestById(@PathVariable Long id) {
        TestDto testDto = testService.getTestById(id);
        return ResponseEntity.ok(testDto);
    }

    @GetMapping(params = {"name"})
    public ResponseEntity<List<TestDto>> getTestsByNameFragment(@RequestParam("name") String nameFragment) {
        List<TestDto> testDtoList = testService.getTestsByNameFragment(nameFragment);
        return ResponseEntity.ok(testDtoList);
    }

    @PostMapping
    public ResponseEntity<TestDto> addTest(@RequestBody TestDto testDto) {
        TestDto addedTest = testService.addTest(testDto);
        return ResponseEntity.ok(addedTest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestDto> updateTest(@PathVariable Long id, @RequestBody TestDto testDto) {
        testDto.setId(id);
        TestDto updatedTest = testService.updateTest(testDto);
        return ResponseEntity.ok(updatedTest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTest(@PathVariable Long id) {
        testService.deleteTest(id);
        return ResponseEntity.noContent().build();
    }
}
