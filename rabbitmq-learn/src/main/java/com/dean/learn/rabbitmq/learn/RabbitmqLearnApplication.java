package com.dean.learn.rabbitmq.learn;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@EnableRabbit
public class RabbitmqLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqLearnApplication.class, args);
    }
}
