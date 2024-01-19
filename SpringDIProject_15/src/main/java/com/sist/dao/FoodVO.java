package com.sist.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor  // 매개변수 없는 생성자 생성
//@AllArgsConstructor // 매개변수가 있는 생성자 생성
public class FoodVO {
	private int fno;
	private String name,address,type;
}
