package com.safalifter.userservice;

import com.safalifter.userservice.enums.Role;
import com.safalifter.userservice.model.User;
import com.safalifter.userservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication implements CommandLineRunner {
    private final UserRepository userRepository;

    public UserServiceApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        final String pass = "$2a$10$Ob0tkKZPMPQXwk52Q7bOiOAxaenp7XGcuUcpni4cd5O8YmHXhM8Ge"; // 12345basel
        var admin = User.builder()
                .username("admin")
                .email("admin@gmail.com")
                .password(pass)
                .role(Role.ADMIN).build();
        if (userRepository.findByUsername("admin").isEmpty()) userRepository.save(admin);
    }
}
