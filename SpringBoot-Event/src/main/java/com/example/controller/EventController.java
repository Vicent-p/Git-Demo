package com.example.controller;

import com.example.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/event")
    public String event(){
        //通过发布器发布事件,source中填的是触发事件的对象
        publisher.publishEvent(new CustomEvent(this));
        return "Success";
    }
}
