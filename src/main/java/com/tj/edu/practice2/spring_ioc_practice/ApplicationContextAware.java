package com.tj.edu.practice2.spring_ioc_practice;

import org.springframework.context.ApplicationContext;

public interface ApplicationContextAware {
    void setApplicationContext(ApplicationContext ctxt);
};
