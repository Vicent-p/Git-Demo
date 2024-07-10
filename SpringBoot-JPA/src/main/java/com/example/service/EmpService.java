package com.example.service;

import com.example.dao.EmpDao;
import com.example.domain.Emp;
import com.example.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repository;

    public List<Emp> selectAllEmp(){
        return repository.findAll();
    }
}
