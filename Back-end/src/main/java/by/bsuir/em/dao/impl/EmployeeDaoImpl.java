package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.EmployeeDao;
import by.bsuir.em.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Employee> getEmployeesByProjectId(Long projectId) {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }
}
