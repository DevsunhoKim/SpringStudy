package com.sist.dao;

import java.util.List;

public class SeoulShopDAO {
	private SeoulShopMapper mapper;

	public void setMapper(SeoulShopMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<SeoulShopVO> shopListData()
	{
		return mapper.shopListData();
	}
	public SeoulShopVO shopDetailData(int no)
	{
		return mapper.shopDetailData(no);
	}
}
