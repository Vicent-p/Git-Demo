package com.example.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandle {

    @ExceptionHandler(Exception.class)
    public ModelAndView handle(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error");
        modelAndView.addObject("message",e.getMessage());
        return modelAndView;
    }


}
