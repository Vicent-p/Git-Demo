package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data@AllArgsConstructor@NoArgsConstructor
public class Guest {
    private String name;
    private String role;

}
