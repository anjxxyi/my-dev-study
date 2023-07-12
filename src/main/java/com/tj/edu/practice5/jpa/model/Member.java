package com.tj.edu.practice5.jpa.model;

import com.tj.edu.practice5.jpa.model.enums.Nation;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "member")
@EntityListeners(value = MyEntityListener.class)
public class Member implements Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue
    private Long id;
    //    @NonNull
    @Column(nullable = false, columnDefinition = "varchar(5)")
    private String name;
    @Column(columnDefinition = "varchar(100)")
    private String email;

    //    @Column(name = "colTest2", unique = true)
    @Column(name = "colTest2", insertable = false, updatable = false)
//    @Transient
    private Integer test2;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;

    private Boolean male;

    @Transient
    private String testData;

    //    @Column(columnDefinition = "varchar(100)")
    @Enumerated(value = EnumType.STRING)
    private Nation nation;

    @PreRemove
    public void preDelete1() {
        System.out.println(">>> preDelete1()");
    }
    @PostPersist
    public void afterInsert1() {
        System.out.println(">>> afterInsert1()");
    }
    @PostUpdate
    public void afterUpdate1() {
        System.out.println(">>> afterUpdate1()");
    }
    @PostRemove
    public void afterDelete1() {
        System.out.println(">>> afterDelete1()");
    }
    @PostLoad
    public void afterSelect1() {
        System.out.println(">>> afterSelect1()");
    }
}