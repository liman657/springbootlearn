package com.learn.rabbitmq.consumer;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class DirectConsumer implements MessageListener {

    private Logger log = Logger.getLogger(DirectConsumer.class);

    @Override
    public void onMessage(Message message) {
        log.info("------> DirectConsumer 接收到的消息为 : " + message);
    }
}
