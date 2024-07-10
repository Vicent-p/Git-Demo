package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("/thymeleaf")
    public String print(Model model){
        model.addAttribute("name","张三");
        return "/thymeleaf/index";
    }
}
