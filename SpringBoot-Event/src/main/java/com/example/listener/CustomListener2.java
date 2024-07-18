package com.example.listener;

import com.example.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("第二种方式实现监听");
    }
}
