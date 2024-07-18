package com.example.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConfig {
    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event){
        System.out.println("ListenerConfig---Web容器的启动类是"
        +event.getWebServer().getClass().getName());
    }
}
