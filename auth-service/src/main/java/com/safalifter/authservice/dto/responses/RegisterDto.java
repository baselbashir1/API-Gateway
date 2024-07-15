package com.safalifter.authservice.dto.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {
    private String id;
    private String username;
    private String email;
}
