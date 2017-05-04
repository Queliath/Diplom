package by.bsuir.em.dao.impl;

import by.bsuir.em.dao.UserDao;
import by.bsuir.em.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserByEmail(String email) {
        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.email = :email", User.class);
        List<User> userList = query.setParameter("email", email).getResultList();
        return userList.isEmpty() ? null : userList.get(0);
    }
}
