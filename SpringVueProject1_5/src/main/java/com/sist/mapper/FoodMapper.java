package com.sist.mapper;
// MyBatis 에서 자동구현이 되는 상태
// => 메소드를 만들면 => 자동 SQL 생성
// findByno(int no) => WHERE no=? findByNameLike => WHERE name LIKE
// insert update delete findAll(page) 
import java.util.*;
import com.sist.dao.*;
import org.apache.ibatis.annotations.Select;
/*
 * 
 */
public interface FoodMapper {

	@Select("SELECT fno,name,poster,num "
			+"FROM (SELECT fno,goods_name,goods_poster,rownum as num "
			+"FROM (SELECT fno,goods_name,goods_poster "
			+"FROM food_menu_house ORDER BY fno ASC)) "
			+"WHERE num BETWEEN #{start} AND #{end}")
	public List<FoodVO> foodListData(Map map);
	
	@Select("SELECT CEIL(COUNT(*)/20.0) FROM food_menu_house")
	public int foodTotalPage();
}
