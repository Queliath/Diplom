package by.bsuir.em.dao;

import by.bsuir.em.entity.User;

public interface UserDao {
    User getUserByEmail(String email);
}
