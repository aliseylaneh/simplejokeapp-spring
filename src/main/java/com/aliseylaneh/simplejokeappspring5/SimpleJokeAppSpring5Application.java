package com.aliseylaneh.simplejokeappspring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SimpleJokeAppSpring5Application {

    public static void main(String[] args) {
        SpringApplication.run(SimpleJokeAppSpring5Application.class, args);
    }

}
