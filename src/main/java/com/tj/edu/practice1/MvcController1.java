package com.tj.edu.practice1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController1 {
    @GetMapping("/test2View")
    public String test2() {
        return "test2";
    }
}

/*
* @Controller : 주로 View를 반환하기 위해 사용
* @RestController : Data를 반환하기 위해 사용
* */