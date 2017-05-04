package by.bsuir.em.service.impl;

import by.bsuir.em.dao.UserDao;
import by.bsuir.em.dto.UserDto;
import by.bsuir.em.dto.converter.impl.UserDtoConverter;
import by.bsuir.em.entity.User;
import by.bsuir.em.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SessionServiceImpl implements SessionService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserDtoConverter userDtoConverter;

    @Override
    @Transactional(readOnly = true)
    public UserDto login(UserDto userDto) {
        User userWithGivenEmail = userDao.getUserByEmail(userDto.getEmail());
        if (userWithGivenEmail != null && userDto.getPassword().equals(userWithGivenEmail.getPassword())) {
            return userDtoConverter.getDto(userWithGivenEmail);
        }
        return null;
    }
}
