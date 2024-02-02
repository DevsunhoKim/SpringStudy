package com.sist.mapper;
import com.sist.vo.*;
import java.util.*;

import org.apache.ibatis.annotations.Select;
public interface MemberMapper {

	@Select("SELECT COUNT(*) FROM vueMember "
			+"WHERE id=#{id}")
	public int idCount(String id);
	
	@Select("SELECT id,name,pwd FROM vueMember "
			+"WHERE id=#{id}")
	public MemberVO isLogin(String id);
}
