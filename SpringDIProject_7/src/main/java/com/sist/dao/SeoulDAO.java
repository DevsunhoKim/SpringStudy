package com.sist.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SeoulDAO {
	private SeoulMapper mapper;
	
	public void setMapper(SeoulMapper mapper) {
		this.mapper = mapper;
	}

	public List<SeoulVO> natureListData()
	{
		return mapper.natureListData();
	}
	public SeoulVO natureDetailData(int no)
	{
		return mapper.natureDetailData(no);
	}
}
