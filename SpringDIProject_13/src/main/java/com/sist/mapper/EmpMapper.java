package com.sist.mapper;
import java.util.*;
import com.sist.dao.*;
import org.apache.ibatis.annotations.Select;
public interface EmpMapper {
	@Select("SELECT empno,ename,job,TO_CHAR(hiredate,'TTTT-MM-DD') as dbday "
			+"sal,deptno "
			+"FROM emp")
	public List<EmpVO> empListData();
}
