package com.safalifter.userservice.mappers;

import com.safalifter.userservice.dto.AuthUserDto;
import com.safalifter.userservice.dto.UserDto;
import com.safalifter.userservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserDto mapToUserDTO(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setUserDetails(user.getUserInformation());
        return userDto;
    }

    public AuthUserDto mapToAuthUserDto(User user) {
        AuthUserDto authUserDto = new AuthUserDto();
        authUserDto.setId(user.getId());
        authUserDto.setUsername(user.getUsername());
        authUserDto.setPassword(user.getPassword());
        authUserDto.setRole(user.getRole());
        return authUserDto;
    }

}
