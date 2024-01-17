package com.sist.main;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=
				new ClassPathXmlApplicationContext("application-*.xml");
		GoodsDAO gDao=(Goods)app.getBean("gDao");
		Scanner scan=new Scanner(System.in);
		System.out.print("1.업체명,2.주소,3.음식종류 선택:");
		int col=scan.nextInt();
		String fd="";
		String[] temp= {"","name","address","type"};
		fd=temp[col];
		System.out.println("검색어 입력:");
		String ss=scan.next();
		
		Map map=new HashMap();
		map.put("col_name", fd);
		map.put("ss", ss);
		
		List<FoodVO> list=fDao.foodfindData(map);
		
		for(FoodVO vo:list)
		{
			System.out.println(vo.getFno()+"0"+vo.getName()+
					" "+vo.getAddress()+" "+vo.getType());
		}
	}

}
