package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.TestPeriodDao;
import by.bsuir.em.entity.TestPeriod;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class TestPeriodDaoImpl implements TestPeriodDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public TestPeriod getLastTestPeriod() {
        TypedQuery<TestPeriod> query = entityManager.createQuery("select tp from TestPeriod tp order by tp.id desc", TestPeriod.class);
        List<TestPeriod> testPeriodList = query.setMaxResults(1).getResultList();
        return testPeriodList.isEmpty() ? null : testPeriodList.get(0);
    }
}
