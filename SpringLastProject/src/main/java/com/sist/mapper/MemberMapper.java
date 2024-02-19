package com.sist.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
   // 회원가입
	@Select("SELECT COUNT(*) FROM projectMember "
			+"WHERE userid=#{userid}")
	public int memberIdCount(String userid);
	
	
   // 로그인
}
