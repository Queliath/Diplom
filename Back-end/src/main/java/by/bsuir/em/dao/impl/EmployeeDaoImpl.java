package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.EmployeeDao;
import by.bsuir.em.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployeesByProjectId(Long projectId) {
        TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.project.id = :projectId", Employee.class);
        return query.setParameter("projectId", projectId).getResultList();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return entityManager.find(Employee.class, id);
    }
}
