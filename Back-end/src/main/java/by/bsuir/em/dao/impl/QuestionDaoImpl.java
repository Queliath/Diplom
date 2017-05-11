package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.QuestionDao;
import by.bsuir.em.entity.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Question> getQuestionsByTestId(Long testId) {
        TypedQuery<Question> query = entityManager.createQuery("select q from Question q where q.test.id = :testId", Question.class);
        return query.setParameter("testId", testId).getResultList();
    }

    @Override
    public Question getQuestionById(Long id) {
        return entityManager.find(Question.class, id);
    }

    @Override
    public Question addQuestion(Question question) {
        entityManager.persist(question);
        return question;
    }

    @Override
    public Question updateQuestion(Question question) {
        return entityManager.merge(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        Question question = entityManager.find(Question.class, id);
        entityManager.remove(question);
    }
}
