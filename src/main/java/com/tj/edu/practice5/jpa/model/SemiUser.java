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
public class SemiUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;			// 아이디

	@NonNull
	private String userPw;			// 비밀번호

	@Column(name="userName", nullable = false)
	private String name;			// 이름
	private String nickname;		// 별명
	private String email;			// 이메일
	private Boolean male;			// 성별
	private String birth;			// 생일
	private Integer livingYear;		// 자취햇수

	@Column(insertable = false, updatable = false)
	private String status;			// 회원등급

	@OneToMany(fetch = FetchType.EAGER)
	private List<Address> address;	// 주소

	@Column(updatable = false)
	private LocalDateTime joindate;	// 가입일

	private String pwQ;				// 비밀번호 질문
	private String pwA;				// 비밀번호 답변
	private Boolean deleteYn;		// 탈퇴여부
}
