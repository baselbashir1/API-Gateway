package com.safalifter.authservice.dto.requests;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String username;
    private String password;
}
