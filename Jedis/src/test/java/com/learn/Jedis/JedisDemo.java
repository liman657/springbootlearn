package com.learn.Jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 * 测试jedis
 */
public class JedisDemo {

    /**
     * 只是测试基本连接
     */
    @Test
    public void demo01() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        //set数据
        jedis.set("name", "liman");

        //获取数据
        String name = jedis.get("name");
        System.out.println(name);

        //释放资源
        jedis.close();
    }

    @Test
    public void testPool() {
        //获得连接池的配置对象
        JedisPoolConfig config = new JedisPoolConfig();

        //设置连接池的相关属性
        config.setMaxIdle(10);
        config.setMaxTotal(30);

        //获得连接池
        JedisPool jedisPool = new JedisPool(config, "127.0.0.1", 6379);
        //获得核心对象
        Jedis jedis = null;
        try {
            //通过连接池获得连接对象
            jedis = jedisPool.getResource();
            jedis.set("lover", "somebody");

            //获得redis中的值
            String lover = jedis.get("lover");
            System.out.println(lover);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭连接对象
            jedis.close();
        }
    }

}
