package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.ProjectDao;
import by.bsuir.em.entity.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProjectDaoImpl implements ProjectDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Project> getProjects() {
        TypedQuery<Project> query = entityManager.createQuery("select p from Project p", Project.class);
        return query.getResultList();
    }

    @Override
    public Project getProjectById(Long id) {
        return entityManager.find(Project.class, id);
    }
}
