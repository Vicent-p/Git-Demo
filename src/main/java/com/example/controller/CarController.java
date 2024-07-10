package com.example.controller;

import com.config.CarConfig;
import com.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Value("${jasypt.encryptor.username}")
    private String username;
    @Value("${jasypt.encryptor.password}")
    private String password;
    @Autowired
   private CarConfig config;


    @RequestMapping("/car")
    public Car byCar(){
        Car car = new Car();
        return car;
    }
    @RequestMapping("/jasypt")
    public String jasypt(){

        return username+password;
    }
}
