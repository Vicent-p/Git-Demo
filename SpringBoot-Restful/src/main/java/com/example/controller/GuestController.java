package com.example.controller;

import com.example.domain.Guest;
import com.example.service.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *业务控制层，控制试图展示，处理请求，返回视图
 *  @RequestMapping("/guest")放在类上面，代表类里面的方法是以此开头的
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestServiceImpl service;

    public GuestController(){}

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping//上面一行注解和当前注解一样
    public String list(Model model){
        List<Guest> guests =  service.list();
        model.addAttribute("guestList",guests);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
       return "add";
    }
    @PostMapping()
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/guest";
    }

    /**
     * 将guest/toUpdate/{name}格式的url映射到此方法
     * 其中的name属性值，通过注解@PathVariable("name")映射到方法的属性中 name是请求携带的参数
     * 从路径中获取name属性的值
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = service.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }
    @PutMapping()
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guest";
    }
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        service.delete(name);
        System.out.println(name);
        return "redirect:/guest";
    }
}
