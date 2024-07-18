package com.example.listener;


import com.example.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 方式三：
 * 不需要实现ApplicationListener接口，
 * 但是要声明当前类是@Component组件需要被加载，声明这是一个监听组件
 * 监听的事件是方法的参数
 */
@Component
public class CustomListener3 {
    @EventListener
    public void eventListener(CustomEvent event){
        event.printMessage("第三种方式监听");
    }
}
