package com.example.dao;

import com.example.domain.Emp;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDao {

    @Select("select * from emp")
    public List<Emp> selectAll();

}
