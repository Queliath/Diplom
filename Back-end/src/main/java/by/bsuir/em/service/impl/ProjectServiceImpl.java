package by.bsuir.em.service.impl;

import by.bsuir.em.dao.ProjectDao;
import by.bsuir.em.dto.ProjectDto;
import by.bsuir.em.dto.converter.impl.ProjectDtoConverter;
import by.bsuir.em.entity.Project;
import by.bsuir.em.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private ProjectDtoConverter projectDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<ProjectDto> getProjects() {
        List<Project> projectList = projectDao.getProjects();
        return projectDtoConverter.getDtoList(projectList);
    }

    @Override
    @Transactional(readOnly = true)
    public ProjectDto getProjectById(Long id) {
        Project project = projectDao.getProjectById(id);
        return projectDtoConverter.getDto(project);
    }
}
