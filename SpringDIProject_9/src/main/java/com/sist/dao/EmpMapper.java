package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
public interface EmpMapper {
	@Results({
		@Result(property ="dvo.dname",column="dname"),
		@Result(property ="dvo.loc",column="loc")
	})
	@Select("SELECT empno,ename,job,hiredate,sal,dname,loc "
			+ "FROM emp JOIN dept"
			+ "WHERE emp.deptno=dept.deptno")
	public List<EmpVO> empDeptJoinData();
}
