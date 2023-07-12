package com.tj.edu.practice5.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class SemiUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@NonNull
	private String password;	
	private String name;
	private String nick;
	private String email;
	private String gender;
	private String birth;
	private String hp;
	private int livingYear;
	private String status;
	private String addr;
	private String addr2;
	private String joindate;
	private String pwQ;
	private String pwA;
	private String deleteYn;
}
