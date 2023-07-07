package com.tj.edu.practice5.lombok;

import com.tj.edu.practice5.lombok.model.Member;
import com.tj.edu.practice5.lombok.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class LombokTestApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @DisplayName("Lombok 테스트")
    @Test
    void lombokTest() {
        User user = new User();
        user.setName("홍길동");
        user.setEmail("gildong@gmail.com");

        User user2 = new User("김복순", "boksun@abc.com", LocalDateTime.now(), LocalDateTime.now());
        User user3 = new User("신짱구", "zzanggu@abc.com");

        System.out.println("NAME: " + user.getName() + "\nE-MAIL: " + user.getEmail());

        // user builder 이용한 user 객체 생성 => null pointer exception을 방지하는 기능
        User user4 = User.builder()
                         .name("강호동")
                         .email("aaa@asdf.com")
                         .createAt(LocalDateTime.now()).build();

        System.out.println("-------------------------------------------------------------");
        System.out.println("NAME: " + user4.getName() + "\nE-MAIL: " + user4.getEmail() + "\nDATE: " + user4.getCreateAt());

        System.out.println("-------------------------------------------------------------");
        Member member = Member.builder().id(1L).age(15).build();
        System.out.println("ID: " + member.getId() + "\nAGE: " + member.getAge());
    }

    @AfterEach
    void tearDown() {
    }
}