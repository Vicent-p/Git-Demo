package com.example.listener;

import com.example.event.CustomEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("第一种方式实现监听");
    }

}
