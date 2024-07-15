package com.safalifter.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.safalifter.userservice.model.UserInformation;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private UserInformation userDetails;
}
