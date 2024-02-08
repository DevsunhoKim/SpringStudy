package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;
public interface GoodsMapper {
   @Select("SELECT no,goods_name,goods_poster,num "
		  +"FROM (SELECT no,goods_name,goods_poster,rownum as num "
		  +"FROM (SELECT no,goods_name,goods_poster "
		  +"FROM goods_all ORDER BY no ASC)) "
		  +"WHERE num BETWEEN #{start} AND #{end}")
   public List<GoodsVO> goodsListData(@Param("start") int start,@Param("end") int end);
   
   @Select("SELECT CEIL(COUNT(*)/12.0) FROM goods_all")
   public int goodsTotalPage();
}