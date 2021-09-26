package com.example.redis.config.properties;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class RedisProperties {

    @Value("${spring.redis.host:localhost}")
    String host;
    @Value("${spring.redis.port:6379}")
    int port;

}
