package com.tj.edu.practice2.spring_ioc_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext ctxt) {
        applicationContext = ctxt;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
