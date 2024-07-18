package com.example.tkmapper;

import com.example.domain.Emp;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TkEmpMapper extends Mapper<Emp> {
}
