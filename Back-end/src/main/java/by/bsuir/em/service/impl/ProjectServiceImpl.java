package by.bsuir.em.service.impl;

import by.bsuir.em.dto.ProjectDto;
import by.bsuir.em.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectDto> getProjects() {
        List<ProjectDto> projectDtoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            ProjectDto projectDto = new ProjectDto();
            projectDto.setId((long) i + 1);
            projectDto.setName("Leffler Group");
            projectDto.setEmployeeCount(56);
            projectDtoList.add(projectDto);
        }

        return projectDtoList;
    }

    @Override
    public ProjectDto getProjectById(Long id) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(id);
        projectDto.setName("Leffler Group");
        projectDto.setEmployeeCount(56);

        return projectDto;
    }
}
