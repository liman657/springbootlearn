package com.learn.rabbitmq.producer;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 *
 * 消息生产者
 */
@Service
public class MessageProducer {

    private Logger log = Logger.getLogger(MessageProducer.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private AmqpTemplate amqpTemplates;

    public void sendMessage(Object message) {
        log.info("发送消息为 : " + message);
        amqpTemplate.convertAndSend("topicKey.name", message);
        amqpTemplate.convertAndSend("topicKeys.name", message);
        amqpTemplates.convertAndSend("directKeys", message);
    }

}
