package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Conroller 控制类  业务逻辑，请求分发  组装响应
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "Hello World";
    }
}
