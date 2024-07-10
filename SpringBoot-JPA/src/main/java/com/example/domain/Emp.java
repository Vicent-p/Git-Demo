package com.example.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Emp implements Serializable {

    @Id
    private Long id;
    @Column
    private Integer empno;
    @Column
    private String ename;
    @Column
    private Float sal;



}
