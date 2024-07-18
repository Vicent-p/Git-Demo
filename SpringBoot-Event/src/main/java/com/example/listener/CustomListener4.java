package com.example.listener;

import com.example.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener4 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("第四种方式监听事件");
    }
}
