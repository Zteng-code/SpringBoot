package com.zst;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主程序类
 * @SpringBootApplication: 这是一个Spring应用
 */
@SpringBootApplication
public class helloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(helloWorldApplication.class, args);
    }
}
