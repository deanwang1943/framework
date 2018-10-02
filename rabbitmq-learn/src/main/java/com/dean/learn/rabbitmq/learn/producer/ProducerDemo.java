package com.dean.learn.rabbitmq.learn.producer;

import com.dean.learn.rabbitmq.learn.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProducerDemo implements RabbitTemplate.ConfirmCallback {

    private RabbitTemplate rabbitTemplate;


    /**
     * 构造方法注入
     */
    @Autowired
    public ProducerDemo(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        //这是是设置回调能收到发送到响应，confirm()在下面解释
        rabbitTemplate.setConfirmCallback(this);
    }

    public void sendMsg(String content) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        //convertAndSend(exchange:交换机名称,routingKey:路由关键字,object:发送的消息内容,correlationData:消息ID)
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTINGKEY, content, correlationId);
    }

    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println(" 回调id:" + correlationData);
        if (ack) {
            System.out.println("消息成功消费");
        } else {
            System.out.println("消息消费失败:" + cause);
        }
    }
}