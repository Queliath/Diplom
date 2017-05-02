package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.ProjectDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.Project;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectDtoConverter implements DtoConverter<Project, ProjectDto> {
    @Override
    public ProjectDto getDto(Project entity) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(entity.getId());
        projectDto.setName(entity.getName());

        return projectDto;
    }

    @Override
    public Project getEntity(ProjectDto dto) {
        Project project = new Project();
        project.setId(dto.getId());
        project.setName(dto.getName());

        return project;
    }

    @Override
    public List<ProjectDto> getDtoList(List<Project> entityList) {
        List<ProjectDto> projectDtoList = new ArrayList<>();
        for (Project project : entityList) {
            projectDtoList.add(getDto(project));
        }

        return projectDtoList;
    }
}
