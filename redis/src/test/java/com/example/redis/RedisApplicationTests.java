package com.example.redis;

import com.example.redis.domain.User;
import com.example.redis.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;

@SpringBootTest
@ActiveProfiles("local")
class RedisApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void 사용자저장() {
        UUID id = UUID.randomUUID();
        User saved = userRepository.save(User.builder()
                .id(id)
                .name("name")
                .build());

        System.out.println(saved);
    }

}
