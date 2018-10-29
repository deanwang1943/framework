package com.dean.learn.kafka.learn.base.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer {
    @KafkaListener(topics = {"test"})
    public void processMessage(String content) {

        System.out.println("消息被消费" + content);
    }
}
