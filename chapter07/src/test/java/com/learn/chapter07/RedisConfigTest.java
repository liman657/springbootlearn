package com.learn.chapter07;

import com.learn.chapter07.config.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {

    /**
     * 入门测试
     */
    @Test
    public void testRedisConfig(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate = ctx.getBean(RedisTemplate.class);
		redisTemplate.opsForValue().set("key1", "value1");
		redisTemplate.opsForHash().put("hash", "field", "hvalue");
//        useSessionCallback(redisTemplate);
//		useRedisCallback(redisTemplate);
        ctx.close();
    }

    @Test
    public void testRedisCallBack(){
        //1.获取redisTemplate.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate = ctx.getBean(RedisTemplate.class);

        //内部类的形式执行redisCallback
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.set("key2".getBytes(),"RedisCallBack".getBytes());
                redisConnection.hSet("hash2".getBytes(),"field".getBytes(),"redisCallBackhash".getBytes());
                return null;
            }
        });

        ctx.close();
    }

    @Test
    public void testSessionCallBack(){
        //1.获取redisTemplate.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate = ctx.getBean(RedisTemplate.class);

        redisTemplate.execute(new SessionCallback() {
            @Override
            public Object execute(RedisOperations redisOperations) throws DataAccessException {
                redisOperations.opsForValue().set("keyForSessionCallback","sessionCallBackValue".getBytes());
                redisOperations.opsForHash().put("hashForSessionCallback","sessionCallbackField","sessionCallbackValue");
                return null;
            }
        });
    }

}
