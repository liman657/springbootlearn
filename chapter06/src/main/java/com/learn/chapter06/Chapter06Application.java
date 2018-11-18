package com.learn.chapter06;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.learn.chapter06.dao")
@EntityScan(basePackages = "com.learn.chapter06")
@MapperScan(
        basePackages = "com.learn.chapter06.*",
        sqlSessionFactoryRef = "sqlSessionFactory",
        sqlSessionTemplateRef = "sqlSessionTemplate",
        annotationClass = Repository.class
)
public class Chapter06Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter06Application.class, args);
    }
}
