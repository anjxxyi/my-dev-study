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
public class TodayEat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int recipeNo;
	private String recipeName;
	private String r_purpose;
	private String howto;
	private String[] ingredient;
	private String tool;
	private String hashtag;
	private String cookIngre;
	private String imgPathT;
	private String imgPathR;
	private String code;
	private String rKind;
	
	private int menuNo;
	private String menuName;
	private String purpose;
	private String situation;
	private String[] nation;
	private String[] location;
	private String imgPath;
	
	private Integer productNo ; 
	private String productName ; 
	private String productKind ; 
	private Integer productWeight; 
	private Integer productEa; 
	private String productVolume; 
	private String title; 
	private String content; 
	private Integer productPrice; 
	private Integer productStock; 
	private Integer productCnt; 
	private String discountYN; 
	private String deleteYN;
	private String[] ingList;	//투데잇 상품 추천용 리스트
}