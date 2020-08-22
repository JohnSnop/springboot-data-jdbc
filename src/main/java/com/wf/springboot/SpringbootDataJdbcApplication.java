package com.wf.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wf.springboot.dao")
@SpringBootApplication
public class SpringbootDataJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataJdbcApplication.class, args);
    }

}
