package com.sist.dao2;
import java.util.*;

import org.apache.ibatis.annotations.Select;
public interface SeoulShopMapper {
	@Select("SELECT no,title,msg,address "
			+ "FROM seoul_shop "
			+"ORDER BY no ASC")
	public List<SeoulShopVO> natureListData();
	
	@Select("SELECT no,title,address,msg "
			+"FROM seoul_shop "
			+"WHERE no=#{no}")
	public SeoulShopVO natureDetailData(int no);
}
