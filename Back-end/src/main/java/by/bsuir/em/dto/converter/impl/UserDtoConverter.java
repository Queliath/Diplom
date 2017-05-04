package by.bsuir.em.dto.converter.impl;

import by.bsuir.em.dto.UserDto;
import by.bsuir.em.dto.converter.DtoConverter;
import by.bsuir.em.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDtoConverter implements DtoConverter<User, UserDto> {
    @Override
    public UserDto getDto(User entity) {
        UserDto userDto = new UserDto();
        userDto.setEmployeeId(entity.getEmployeeId());
        userDto.setRole(entity.getRole());

        return userDto;
    }

    @Override
    public User getEntity(UserDto dto) {
        return null;
    }

    @Override
    public List<UserDto> getDtoList(List<User> entityList) {
        return null;
    }
}
