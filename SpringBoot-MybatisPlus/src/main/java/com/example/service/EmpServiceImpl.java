package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.Emp;
import com.example.mapper1.EmpMapper;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper,Emp> implements EmpService {
}
