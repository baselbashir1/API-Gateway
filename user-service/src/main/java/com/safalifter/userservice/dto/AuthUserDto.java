package com.safalifter.userservice.dto;

import com.safalifter.userservice.enums.Role;
import lombok.Data;

@Data
public class AuthUserDto {
    private Long id;
    private String username;
    private String password;
    private Role role;
}