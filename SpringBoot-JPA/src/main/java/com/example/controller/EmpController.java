package com.example.controller;

import com.example.domain.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService service;

    @RequestMapping(value = "/selectall")
    public String selectAllEmp(){
        List<Emp> list = service.selectAllEmp();
        for (Emp emp : list) {
            System.out.println(emp);
        }
       return "index";
    }
    @RequestMapping("/test")
    public void selectOne(){
        System.out.println("测试界面！！！");
    }
}
