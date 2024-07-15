package com.safalifter.authservice.service;

import com.safalifter.authservice.clients.UserServiceClient;
import com.safalifter.authservice.dto.responses.RegisterDto;
import com.safalifter.authservice.dto.responses.TokenDto;
import com.safalifter.authservice.exceptions.WrongCredentialsException;
import com.safalifter.authservice.dto.requests.LoginRequest;
import com.safalifter.authservice.dto.requests.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserServiceClient userServiceClient;
    private final JwtService jwtService;

    public TokenDto login(LoginRequest request) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        if (authenticate.isAuthenticated())
            return TokenDto
                    .builder()
                    .token(jwtService.generateToken(request.getUsername()))
                    .build();
        else throw new WrongCredentialsException("Wrong credentials");
    }

    public RegisterDto register(RegisterRequest request) {
        return userServiceClient.save(request).getBody();
    }

}
