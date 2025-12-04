package com.java.crud_investments.service;

import com.java.crud_investments.dto.CreateUserDto;
import com.java.crud_investments.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUser(CreateUserDto createUserDto) {

    }
}
