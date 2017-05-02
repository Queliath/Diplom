package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestDao;
import by.bsuir.em.entity.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Test> getTests() {
        return null;
    }

    @Override
    public Test getTestById(Long id) {
        return null;
    }
}
