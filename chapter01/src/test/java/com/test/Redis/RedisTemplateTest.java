package com.test.Redis;

import com.learn.spring.Redis.RedisConfig;
import com.test.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class RedisTemplateTest extends BaseTest {

    public RedisTemplateTest(){
        super("classpath:spring-redis.xml");
    }

    @Test
    public void testRedisConnection(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);

        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);

        redisTemplate.opsForValue().set("key1","value1");
        redisTemplate.opsForHash().put("hash","field","hvalue");
    }


}
