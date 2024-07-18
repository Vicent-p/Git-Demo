package com.example.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Emp implements Serializable {

    @Id
    @Column(name = "empno")
    private Integer empno;

    @Column(name = "ename")
    private String ename;

    @Column(name = "sal")
    private Float sal;



}
