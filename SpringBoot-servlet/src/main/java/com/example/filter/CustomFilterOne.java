package com.example.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter(filterName = "customFilterOne",urlPatterns = "/*")
public class CustomFilterOne implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilterOne的init方法");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CustomFilterOne的doFilter方法");
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilterOne的destroy方法");
    }
}
