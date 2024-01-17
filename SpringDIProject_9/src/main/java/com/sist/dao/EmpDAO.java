package com.sist.dao;
import java.util.*;
public class EmpDAO {
	private EmpMapper mapper;

	public void setMapper(EmpMapper mapper) {
		this.mapper = mapper;
	}
	public List<EmpVO> empDeptJoinData()
	{
		return mapper.empDeptJoinData();
	}
}
