package com.example.repository;

import com.example.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Long> {
}
