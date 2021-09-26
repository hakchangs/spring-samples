package com.example.redis.config;

import com.example.redis.config.properties.RedisProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import redis.embedded.RedisServer;

@Configuration
@RequiredArgsConstructor
@Profile({"local"})
@Slf4j
public class EmbeddedRedisConfig implements InitializingBean, DisposableBean {

    private final RedisProperties props;
    private RedisServer server;

    @Override
    public void afterPropertiesSet() {

        log.info("redis info...port={}", props.getPort());

        server = new RedisServer(props.getPort());
        server.start();
    }

    @Override
    public void destroy() {
        if (server != null) {
            server.stop();
        }
    }

}
