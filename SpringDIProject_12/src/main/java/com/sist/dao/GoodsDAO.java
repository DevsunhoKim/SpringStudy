package com.sist.dao;
import com.sist.mapper.*;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDAO {
	@Autowired
	private GoodsMapper mapper;
	public List<GoodsVO> goodsFindData(Map map)
	{
		return mapper.goodsFindData(map);
	}
}
