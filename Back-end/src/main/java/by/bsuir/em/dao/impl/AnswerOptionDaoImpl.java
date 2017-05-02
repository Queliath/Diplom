package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.AnswerOptionDao;
import by.bsuir.em.entity.AnswerOption;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AnswerOptionDaoImpl implements AnswerOptionDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AnswerOption> getAnswerOptionsByQuestionId(Long questionId) {
        TypedQuery<AnswerOption> query = entityManager.createQuery("select ao from AnswerOption ao where ao.question.id = :questionId", AnswerOption.class);
        return query.setParameter("questionId", questionId).getResultList();
    }
}
