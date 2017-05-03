package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.ProjectDao;
import by.bsuir.em.entity.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectDaoImpl implements ProjectDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Project> getProjects() {
        TypedQuery<Project> query = entityManager.createQuery("select p from Project p", Project.class);
        List<Project> projectList = query.getResultList();
        if (!projectList.isEmpty()) {
            setEmployeesCountForProjectList(projectList);
        }
        return projectList;
    }

    @Override
    public Project getProjectById(Long id) {
        Project project = entityManager.find(Project.class, id);
        if (project != null) {
            setEmployeesCountForSingleProject(project);
        }
        return project;
    }

    private void setEmployeesCountForProjectList(List<Project> projectList) {
        TypedQuery<Project> query = entityManager.createQuery("select new Project(p.id, count(e.id)) from Project p left join p.employees e where p.id in (:projectIds) group by p.id", Project.class);
        List<Long> projectIds = new ArrayList<>(projectList.size());
        for (Project project : projectList) {
            projectIds.add(project.getId());
        }
        List<Project> projectsWithEmployeesCount = query.setParameter("projectIds", projectIds).getResultList();

        for (Project project : projectList) {
            for (Project projectWithEmployeesCount : projectsWithEmployeesCount) {
                if (project.getId().equals(projectWithEmployeesCount.getId())) {
                    project.setEmployeesCount(projectWithEmployeesCount.getEmployeesCount());
                    break;
                }
            }
        }
    }

    private void setEmployeesCountForSingleProject(Project project) {
        TypedQuery<Long> query = entityManager.createQuery("select count(e.id) from Project p left join p.employees e where p.id = :projectId", Long.class);
        Long employeesCount = query.setParameter("projectId", project.getId()).getSingleResult();
        project.setEmployeesCount(employeesCount);
    }
}
