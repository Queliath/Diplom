package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.QuestionDao;
import by.bsuir.em.entity.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Question> getQuestionsByTestId(Long testId) {
        return null;
    }

    @Override
    public Question getQuestionById(Long id) {
        return null;
    }
}
