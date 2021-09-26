package com.example.redis.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@RedisHash("user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class User {

    @Id UUID id;
    String name;

}
