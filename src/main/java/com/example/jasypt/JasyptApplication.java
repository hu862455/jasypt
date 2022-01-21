package com.example.jasypt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.exmple.jasypt") // mybatis-plus包扫描路径
public class JasyptApplication {

    public static void main(String[] args) {
        SpringApplication.run(JasyptApplication.class, args);
    }

}
