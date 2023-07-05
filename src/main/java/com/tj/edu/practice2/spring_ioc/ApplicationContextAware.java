package com.tj.edu.practice2.spring_ioc;

import org.springframework.context.ApplicationContext;

public interface ApplicationContextAware {
    void setApplicationContext(ApplicationContext ctx);
}
