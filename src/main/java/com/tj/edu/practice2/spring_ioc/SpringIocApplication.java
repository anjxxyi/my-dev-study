package com.tj.edu.practice2.spring_ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringIocApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
        ApplicationContext ac = ApplicationContextProvider.getApplicationContext();

        String url = "https://www.naver.com";

        Encoder encoder = ac.getBean("base64Encode", Encoder.class);
        System.out.println("encoder객체: " + encoder);

        String resultStr = encoder.encodeToString(url);
        byte[] resultByte = encoder.encodeToByte(url);
        System.out.println(resultStr);
        System.out.println("spring-ioc연습 끝");
    }
}
@Configuration(enforceUniqueMethods = false)
class AppConfig {
    @Bean
    public Encoder base64Encode(Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }
    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }
}
