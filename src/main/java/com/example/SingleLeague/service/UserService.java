package com.example.SingleLeague.service;

import com.example.SingleLeague.entity.User;

import java.util.Map;

/**
 * @author Chris Yang
 * created 2022-08-21 15:49
 **/
public interface UserService {
    User findUserById(int id);

    Map<String, Object> register(User user);

    int activation(int userId, String code);
}
