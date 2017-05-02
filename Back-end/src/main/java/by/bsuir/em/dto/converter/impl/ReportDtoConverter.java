package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.ReportDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Report;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportDtoConverter implements DtoConverter<Report, ReportDto> {
    @Override
    public ReportDto getDto(Report entity) {
        ReportDto reportDto = new ReportDto();
        reportDto.setTestPeriodId(entity.getTestPeriodId());
        reportDto.setTestCount(entity.getTestCount());
        reportDto.setAverageSuccess(entity.getAverageSuccess());

        return reportDto;
    }

    @Override
    public Report getEntity(ReportDto dto) {
        return null;
    }

    @Override
    public List<ReportDto> getDtoList(List<Report> entityList) {
        List<ReportDto> reportDtoList = new ArrayList<>();
        for (Report report : entityList) {
            reportDtoList.add(getDto(report));
        }

        return reportDtoList;
    }
}
