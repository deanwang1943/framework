package com.dean.learn.kafka.learn.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value = {"com.dean.learn.kafka.learn.base"})
public class KafkaBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaBaseApplication.class, args);
    }
}
