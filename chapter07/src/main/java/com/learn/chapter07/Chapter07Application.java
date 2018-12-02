package com.learn.chapter07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com.learn.chapter07")
public class Chapter07Application {

	@Autowired
	private RedisTemplate redisTemplate;

	@PostConstruct
	public void init(){
		initRedisTemplate();
	}

	private void initRedisTemplate(){
		RedisSerializer stringSerializer = redisTemplate.getStringSerializer();
		redisTemplate.setKeySerializer(stringSerializer);
		redisTemplate.setHashKeySerializer(stringSerializer);
	}


	public static void main(String[] args) {
		SpringApplication.run(Chapter07Application.class, args);
	}
}
