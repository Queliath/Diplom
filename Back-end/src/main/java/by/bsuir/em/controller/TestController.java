package by.bsuir.em.controller;

import by.bsuir.em.dto.TestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tests")
public class TestController {

    @GetMapping
    public ResponseEntity<List<TestDto>> getTests() {
        List<TestDto> testDtoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            TestDto testDto = new TestDto();
            testDto.setId((long) i + 1);
            testDto.setName("Managed background approach");
            testDto.setQuestionsCount(15);
            testDto.setFixedTime(30);

            testDtoList.add(testDto);
        }

        return ResponseEntity.ok(testDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestDto> getTestById(@PathVariable Long id) {
        TestDto testDto = new TestDto();
        testDto.setId(id);
        testDto.setName("Managed background approach");
        testDto.setQuestionsCount(15);
        testDto.setFixedTime(30);

        return ResponseEntity.ok(testDto);
    }
}
