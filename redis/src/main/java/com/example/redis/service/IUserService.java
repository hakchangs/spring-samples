package com.example.redis.service;

import com.example.redis.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserService {

    User addUser(User newUser);
    Optional<User> getUser(UUID id);
    User updateUser(User update);
    void removeUser(UUID id);

    List<User> getAll();

}
