package com.learn.test;

import com.learn.rabbitmq.producer.MessageProducer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml"})
public class CastSpringRabbitMQ {

    private Logger logger = LoggerFactory.getLogger(CastSpringRabbitMQ.class);

    private ApplicationContext context = null;


    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test() throws InterruptedException {
        MessageProducer messageProducer = (MessageProducer) context.getBean("messageProducer");
        int a = 100;
        while (a > 0) {
            messageProducer.sendMessage("Hello, I am amq sender num :" + a--);
            try {
                //暂停一下，好让消息消费者去取消息打印出来
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
