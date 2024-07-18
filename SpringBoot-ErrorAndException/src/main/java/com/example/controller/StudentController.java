package com.example.controller;

import com.example.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {
//    @PostMapping("/add")
//    public String add(@Valid Student student, BindingResult result){
//        List<FieldError> list = result.getFieldErrors();
//        StringBuffer buffer = new StringBuffer();
//        if (result.getErrorCount() > 0){
//            for (FieldError fieldError : list) {
//                buffer.append( fieldError.getField()) ;
//                buffer.append("\n");
//                buffer.append(fieldError.getDefaultMessage());
//                buffer.append("\n");
//            }
//            return buffer.toString();
//        }
//
//        return "Success";
//    }
    @RequestMapping("/testerror")
    public String testException() throws Exception {
        throw  new Exception("这是一个异常页");
    }

}
