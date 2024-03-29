package com.sist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sist.mapper.GoodsMapper;
import com.sist.vo.GoodsVO;

// 스프링에 의해 메모리 할당 => 필요시마다 사용이 가능 => 클래스 관리자 
// 클래스 : 컴포넌트 , => 여러개 묶어서 관리 (컨테이너) ==> 컨테이너,조립자
// Vue.createtApp : 컨테이너 , components
/*
 *    컴퓨터 
 *      CPU / 하드디스크 ... 메모리 => 컴포넌트 
 *      ----------------------
 *        조립 : 메인보드 (스프링)
 */
@Repository
public class GoodsDAO {
  @Autowired
  private GoodsMapper mapper;//new FoodMapper()
  
  public List<GoodsVO> goodsListData(int start,int end)
  {
	  return mapper.goodsListData(start, end);
  }
  
  public int goodsTotalPage()
  {
	  return mapper.goodsTotalPage();
  }
}







