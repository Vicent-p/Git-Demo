package com.example.config;

import com.example.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new CustomFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
