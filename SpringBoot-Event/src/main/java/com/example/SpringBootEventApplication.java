package com.example;

import com.example.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;
import java.util.EventListener;

@SpringBootApplication
public class SpringBootEventApplication {

    public static void main(String[] args) {
//        //获取启动后的容器，加载自定义监听器
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootEventApplication.class, args);
        context.addApplicationListener(new CustomListener1());
    }

}
