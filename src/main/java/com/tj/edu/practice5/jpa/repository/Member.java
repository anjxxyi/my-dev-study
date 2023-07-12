package com.tj.edu.practice5.jpa.repository;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
//@Entity(name = "memberCopy")
//@Table(name = "memberCopy")
public class Member {
//    @Id
    private Long id;
    private Integer age;
}
