package com.dean.learn.kafka.learn.base;

import com.dean.learn.kafka.learn.base.service.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = KafkaBaseApplication.class)
public class BaseTest {

    @Autowired
    private MsgProducer msgProducer;

    @Test
    public void test() throws Exception {

        msgProducer.sendMessage("test", "topic--------1");
//        msgProducer.sendMessage("topic-2", "topic--------2");
    }
}

