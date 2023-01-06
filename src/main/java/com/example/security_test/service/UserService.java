package com.example.security_test.service;

import com.example.security_test.dto.UserDto;
import com.example.security_test.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
