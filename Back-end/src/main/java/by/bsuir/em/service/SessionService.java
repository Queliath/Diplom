package by.bsuir.em.service;

import by.bsuir.em.dto.UserDto;

public interface SessionService {
    UserDto login(UserDto userDto);
}
