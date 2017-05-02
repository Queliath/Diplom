package by.bsuir.em.service;

import by.bsuir.em.dto.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getProjects();
    ProjectDto getProjectById(Long id);
}
