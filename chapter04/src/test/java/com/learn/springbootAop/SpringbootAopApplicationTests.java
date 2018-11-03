package com.learn.springbootAop;

import com.learn.springbootAop.aspect.UserAspect;
import com.learn.springbootAop.domain.User;
import com.learn.springbootAop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@SpringBootApplication(scanBasePackages = {"com.learn.springbootAop"})
public class SpringbootAopApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testUser(){
		userService.printUser();
	}

}
