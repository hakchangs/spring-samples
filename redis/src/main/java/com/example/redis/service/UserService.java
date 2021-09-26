package com.example.redis.service;

import com.example.redis.domain.User;
import com.example.redis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository repository;

    @Override
    public User addUser(User newUser) {
        return repository.save(newUser);
    }

    @Override
    public Optional<User> getUser(UUID id) {
        return repository.findById(id);
    }

    @Override
    public User updateUser(User update) {
        return repository.save(update);
    }

    @Override
    public void removeUser(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
