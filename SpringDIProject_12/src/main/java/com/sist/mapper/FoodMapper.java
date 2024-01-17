package com.sist.mapper;
import java.util.*;
import com.sist.mapper.*;
import com.sist.dao.*;
public interface FoodMapper {
	/*
	 * <mapper namespace="com.sist.mapper.FoodMapper">
	 * <select id="foodFindData" resultType="FoodVO" parameterType="hashMap">
   		SELECT fno,name,type,address,price,time,content
   		FROM food_menu_house
   		WHERE ${col_name} LIKE '%'||#{ss}||'%'
  		</select>
	 */
	public List<FoodVO> foodfindData(Map map);
}
