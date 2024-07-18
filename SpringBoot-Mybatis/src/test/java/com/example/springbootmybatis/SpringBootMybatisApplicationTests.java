package com.example.springbootmybatis;

import org.junit.Test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@MapperScan("com.example.mapper")
@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Test
    void contextLoads() {
    }

}
