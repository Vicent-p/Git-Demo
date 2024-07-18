package com.example.mapper2;

import com.example.domain.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper2 {
    @Select("select * from emp")
    public List<Emp> selectAll();
}
