package com.tj.edu.practice5.jpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "member")
public class Member {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue
    private Long id;
    //    @NonNull
    private String name;
    private String email;
    //    private long test1;
//    private Integer test2;
//    private int test3;
//    @NonNull
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;

    private Boolean male;
}