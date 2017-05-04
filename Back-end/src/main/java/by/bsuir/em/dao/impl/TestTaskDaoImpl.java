package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestTaskDao;
import by.bsuir.em.entity.TestTask;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class TestTaskDaoImpl implements TestTaskDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TestTask> getTestTasksByEmployeeId(Long employeeId) {
        TypedQuery<TestTask> query = entityManager.createQuery("select tt from TestTask tt join fetch tt.testTaskPk.test where tt.testTaskPk.employee.id = :employeeId", TestTask.class);
        return query.setParameter("employeeId", employeeId).getResultList();
    }
}
