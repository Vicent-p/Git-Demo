package com.example.test;

import com.example.bean.Student;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class StudentValidTest {
    public static void main(String[] args) {
        //通过Validation创建一个Validator实例  (普通模式)
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        //创建一个不符合要求的bean
        Student student = new Student("","");
        //开始验证，接收验证结果
        Set<ConstraintViolation<Student>> set = validator.validate(student);
        for (ConstraintViolation<Student> violation : set) {
            //获取bean属性名称，和提示信息
            System.out.println(violation.getPropertyPath()+","+violation.getMessage());
        }
    }
}
