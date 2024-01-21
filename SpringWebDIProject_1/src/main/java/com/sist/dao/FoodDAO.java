package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
/*
 *   어노테이션 : 구분자
 *   ==========
 *   1. 메모리 할당 요청(선택적 어노테이션) => 클래스별 구분
 *          @Component
 *              |
 *    ---------------------------------------------------- @RestControllerAdvice
 *    |             |                |                   | @ControllerAdvice
 *   @Repository  @Service       @Controller          @RestController
 *     DAO          BI               Model               Vue / React
 *   2. DI(주입)
 *   3. AOP : 공통모듈
 */
@Repository
public class FoodDAO {
	@Autowired
	private FoodMapper mapper;
	
	public List<FoodVO> foodListData(int start,int end)
	{
		return mapper.foodListData(start, end);
	}
	public int foodTotalPage()
	{
		return mapper.foodTotalPage();
	}
}
