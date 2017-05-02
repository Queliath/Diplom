package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestDao;
import by.bsuir.em.entity.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Test> getTests() {
        TypedQuery<Test> query = entityManager.createQuery("select t from Test t", Test.class);
        return query.getResultList();
    }

    @Override
    public Test getTestById(Long id) {
        return entityManager.find(Test.class, id);
    }
}
