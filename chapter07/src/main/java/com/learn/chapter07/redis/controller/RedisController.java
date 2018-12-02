package com.learn.chapter07.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisZSetCommands;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
@RequestMapping(value="/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate = null;

    @Autowired
    private StringRedisTemplate stringRedisTemplate = null;

    @RequestMapping("/stringAndHash")
    @ResponseBody
    public Map<String,Object> redisStringAndHash(){

        redisTemplate.opsForValue().set("keyForSpringboot","springbootredisvalue");
        //这里没设置序列化器，只是使用了Jdk的序列化器，所以redis保存的不是指定的类型，因此不能运算
        redisTemplate.opsForValue().set("int_key","1");

        stringRedisTemplate.opsForValue().set("int","1");
        stringRedisTemplate.opsForValue().increment("int",1);

        //通过原始的jedis操作redis,减法操作RedisTemplate不支持，所以需要通过底层的jedis进行操作。
        Jedis jedis = (Jedis)stringRedisTemplate.getConnectionFactory().getConnection().getNativeConnection();
        jedis.decr("int");

        //构建散列类型的数据，准备存入
        Map<String,String> hash = new HashMap<>();
        hash.put("field1","value1");
        hash.put("field2","value2");

        //存入一个散列的数据类型
        stringRedisTemplate.opsForHash().putAll("hash",hash);
        stringRedisTemplate.opsForHash().put("hash","field1","value1");

        //利用BoundHashOperations对象操作hash数据类型，可以连续对同一个散列数据类型进行操作
        BoundHashOperations hashOps = stringRedisTemplate.boundHashOps("hash");
        //删除两个指定的字段
        hashOps.delete("field1","field2");
        //新增一个字段
        hashOps.put("field5","value5");

        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",true);
        return result;
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> ListOperation(){

        stringRedisTemplate.opsForList().leftPushAll("list1","v2","v4","v6","v8","v10");
        stringRedisTemplate.opsForList().rightPushAll("list2","v1","v3","v5","v7","v9");

        //绑定list2链表操作
        BoundListOperations listOps = stringRedisTemplate.boundListOps("list2");
        //从右边弹出一个元素
        Object element = listOps.rightPop();
        Object posElement = listOps.index(2);
        listOps.leftPush("v0");

        Long size = listOps.size();
        List elements = listOps.range(0,size-2);
        for(Object obj : elements){
            System.out.println(obj);
        }
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",true);
        return result;
    }

    @RequestMapping("/set")
    @ResponseBody
    public Map<String,Object> setOperation(){
        stringRedisTemplate.opsForSet().add("set1","v1","v1","v2","v3","v4","v5","v6");
        stringRedisTemplate.opsForSet().add("set2","v2","v4","v6","v8");

        //绑定set1集合
        BoundSetOperations setOps = stringRedisTemplate.boundSetOps("set1");
        //增加两个元素
        setOps.add("v7","v8");
        setOps.remove("v1","v7");
        //返回所有元素
        Set set1 = setOps.members();
        Long size = setOps.size();

        //求交集
        Set inter = setOps.intersect("set2");
        for(Object obj:inter){
            System.out.println(obj);
        }
        //求交集，并用新集合inter保存
        setOps.intersectAndStore("set2","inter");
        //求差集
        Set diff = setOps.diff("set2");
        for(Object obj:inter){
            System.out.println(obj);
        }
        //求差集，并用新集合diff保存
        setOps.diffAndStore("set2","diff");

        Set union = setOps.union("set2");
        for(Object obj:inter){
            System.out.println(obj);
        }
        //求并集，并用新集合union保存
        setOps.unionAndStore("set2","union");

        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",true);
        return result;
    }

    @RequestMapping("/zset")
    @ResponseBody
    public Map<String,Object> zSetOperation(){

        //存储分数的集合
        Set<ZSetOperations.TypedTuple<String>> typedTupleSet = new HashSet<>();
        for(int i=1;i<=9;i++){
            double score = i*0.1;
            ZSetOperations.TypedTuple<String> typedTuple = new DefaultTypedTuple<String>("value"+i,score);
            typedTupleSet.add(typedTuple);
        }

        //往有序集合中插入元素
        stringRedisTemplate.opsForZSet().add("zset1",typedTupleSet);
        BoundZSetOperations<String,String> boundZSetOperations = stringRedisTemplate.boundZSetOps("zset1");
        boundZSetOperations.add("value10",0.26);
        Set<String> setRange = boundZSetOperations.range(1,6);

        //将分数排序获取有序集合
        Set<String> setScore = boundZSetOperations.rangeByScore(0.2,0.6);
        //定义取值范围
        RedisZSetCommands.Range range = new RedisZSetCommands.Range();
        //大于value3
        range.gt("value3");
        //小于等于value8
        range.lte("value8");

        //按值排序
        Set<String> setLex = boundZSetOperations.rangeByLex(range);
        //删除元素
        boundZSetOperations.remove("value9","value2");
        //求分数
        Double score = boundZSetOperations.score("value8");
        Set<ZSetOperations.TypedTuple<String>> rangSet = boundZSetOperations.rangeWithScores(1,6);
        Set<String> reverseSet = boundZSetOperations.reverseRange(2,8);


        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",true);
        return result;
    }

}
