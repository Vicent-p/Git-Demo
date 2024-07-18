package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data@AllArgsConstructor
public class Student {
    @NotBlank(message = "username is required")
    private String name;
    @NotBlank(message = "sex is required")
    private String sex;
}
