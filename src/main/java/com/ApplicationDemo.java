package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ApplicationDemo {
    public static void main(String[] args) {
        //使用SpringApplication的静态方法 启动SpringBoot程序
        SpringApplication.run(ApplicationDemo.class,args);
    }
}
