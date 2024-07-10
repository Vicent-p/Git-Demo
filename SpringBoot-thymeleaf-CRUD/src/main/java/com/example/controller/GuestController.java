package com.example.controller;

import com.example.domain.Guest;
import com.example.service.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *业务控制层，控制试图展示，处理请求，返回视图
 */
@Controller
public class GuestController {
    @Autowired
    private GuestServiceImpl service;

    public GuestController(){}

    @RequestMapping("/guest/list")
    public String list(Model model){
        List<Guest> guests =  service.list();
        model.addAttribute("guestList",guests);
        return "list";
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
       return "add";
    }
    @RequestMapping("/guest/add")
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toupdate")
    public String toUpdate(Model model,String name){
        Guest guest = service.get(name);

        model.addAttribute("guest",guest);
        return "update";
    }
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guest/list";
    }
    @RequestMapping("/guest/delete")
    public String delete(String name){
        service.delete(name);
        System.out.println(name);
        return "redirect:/guest/list";
    }
}
