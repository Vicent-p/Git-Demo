package com.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
public class Car {
    private Float price;
    private String color;


}
