package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.ProjectDao;
import by.bsuir.em.entity.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectDaoImpl implements ProjectDao {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Project> getProjects() {
        return null;
    }

    @Override
    public Project getProjectById(Long id) {
        return null;
    }
}
