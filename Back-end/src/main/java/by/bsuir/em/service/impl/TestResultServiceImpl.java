package by.bsuir.em.service.impl;

import by.bsuir.em.dto.TestResultDto;
import by.bsuir.em.service.TestResultService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestResultServiceImpl implements TestResultService {
    @Override
    public List<TestResultDto> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        List<TestResultDto> testResultDtoList = new ArrayList<>(12);
        for (int i = 0; i < 12; i++) {
            TestResultDto testResultDto = new TestResultDto();
            testResultDto.setTestName("Triple-buffered actuating benchmark");
            testResultDto.setSuccess(91.1F);

            testResultDtoList.add(testResultDto);
        }

        return testResultDtoList;
    }
}