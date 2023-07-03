package com.tj.edu.practice1;

import org.springframework.web.bind.annotation.*;

@RestController
public class MvcApiController1 {
    @GetMapping(value = "test1")
    public String test1() {
        return "test1";
    }

    // POST : 데이터 등록하는 http 메소드
    @PostMapping(value = "/post-test1")
    public String postTest1() {
        return """
                {
                    "name": "홍길동",
                    "birth": "1990-05-05"
                }
                """;
    }

    @PutMapping(value = "/put-test1")
    public String putTest1() {
        return "PUT : 데이터 업데이트용 http 메소드";
    }

    @DeleteMapping(value = "/del-test1")
    public String deleteTest1() {
        return "DELETE : 데이터 삭제용 http 메소드";
    }
}
