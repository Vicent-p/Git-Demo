package com.example.controller;

import com.example.domain.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

    @RequestMapping("/selectall")
    public String selectAll(Model model){
        List<Emp> list = service.selectAll();
        for (Emp emp : list) {
            System.out.println(emp.toString());
        }
        return "thymeleaf/index";
    }
}
