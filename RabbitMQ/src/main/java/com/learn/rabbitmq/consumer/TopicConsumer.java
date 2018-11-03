package com.learn.rabbitmq.consumer;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.MessageListener;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 *  消息消费者
 */
public class TopicConsumer implements MessageListener {
    private Logger log = Logger.getLogger(TopicConsumer.class);

    @Override
    public void onMessage(org.springframework.amqp.core.Message message) {
        log.info("------> TopicConsumer 接收到的消息为 : " + message);
    }
}
