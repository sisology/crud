package com.spring.crudpractice.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.crudpractice")
@MapperScan(basePackages = "com.spring.crudpractice", annotationClass = Mapper.class)
public class CrudPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudPracticeApplication.class, args);
    }

}
