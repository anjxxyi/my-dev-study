package com.tj.edu.practice2.spring_ioc_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIocPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringIocPracticeApplication.class, args);
        ApplicationContext ac = ApplicationContextProvider.getApplicationContext();

        String url = "http://www.anjxxyi.com";

        Encoder encoder = ac.getBean("base64Encode", Encoder.class);
        System.out.println("encoder 객체 : " + encoder);

        String resultStr = encoder.encodeToString(url);
        System.out.println(resultStr);


        System.out.println("SpringIocPracticeApplication --- END");
    }
}

class AppConfig {
}