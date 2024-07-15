package com.safalifter.userservice.model;

import com.safalifter.userservice.enums.Active;
import com.safalifter.userservice.enums.Role;
import lombok.*;

import javax.persistence.*;

@Entity(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false, updatable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Active active;

    @Embedded
    private UserInformation userInformation;

}
