package com.example.service;

import com.example.domain.Emp;
import com.example.mapper1.EmpMapper1;
import com.example.mapper1.EmpMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

//    @Autowired
//    private EmpMapper mapper;
//    public List<Emp> selectAll(){
//        return mapper.selectAll();
//    }
//    @Autowired
//    private TkEmpMapper mapper;

    @Autowired
    private EmpMapper1 mapper;

    public List<Emp> selectAll(){
        return mapper.selectAll();
    }

}
