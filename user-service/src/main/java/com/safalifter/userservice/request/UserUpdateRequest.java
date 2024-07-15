package com.safalifter.userservice.request;

import com.safalifter.userservice.model.UserInformation;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserUpdateRequest {
    @NotBlank(message = "Id is required")
    private String id;
    private String username;
    private String password;
    private UserInformation userInformation;
}
