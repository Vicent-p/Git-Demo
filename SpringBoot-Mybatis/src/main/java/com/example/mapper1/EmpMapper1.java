package com.example.mapper1;
import com.example.domain.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface EmpMapper1{
    @Select("select * from emp")
    public List<Emp> selectAll();
}
