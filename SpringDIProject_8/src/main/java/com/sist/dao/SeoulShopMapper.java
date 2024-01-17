package com.sist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;



public interface SeoulShopMapper {
	@Select("SELECT no,title,msg,address "
			+ "FROM seoul_shop "
			+"ORDER BY no ASC")
	public List<SeoulShopVO> shopListData();
	
	@Select("SELECT no,title,address,msg "
			+"FROM seoul_shop "
			+"WHERE no=#{no}")
	public SeoulShopVO shopDetailData(int no);
}
