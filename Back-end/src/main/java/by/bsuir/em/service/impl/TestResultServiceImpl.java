package by.bsuir.em.service.impl;

import by.bsuir.em.dto.TestResultDto;
import by.bsuir.em.service.TestResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultServiceImpl implements TestResultService {
    @Override
    public List<TestResultDto> getTestResultsByEmployeeIdAndTestPeriodId(Long employeeId, Long testPeriodId) {
        return null;
    }
}
