package by.bsuir.em.dao;

import by.bsuir.em.entity.Project;

import java.util.List;

public interface ProjectDao {
    List<Project> getProjects();
    Project getProjectById(Long id);
}
