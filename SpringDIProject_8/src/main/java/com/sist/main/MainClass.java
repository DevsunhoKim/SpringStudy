package com.sist.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.SeoulShopDAO;
import com.sist.dao.SeoulShopVO;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		
		SeoulShopDAO dao=(SeoulShopDAO)app.getBean("dao");
		List<SeoulShopVO> list=dao.shopListData();
		for(SeoulShopVO vo:list)
		{
			System.out.println(vo.getNo()+"."+vo.getTitle());
		}
		System.out.println("===================");
		Scanner scan=new Scanner(System.in);
		System.out.println("번호 입력:");
		int no=scan.nextInt();
		SeoulShopVO vo=dao.shopDetailData(no);
		System.out.println("번호:"+vo.getNo());
		System.out.println("장소:"+vo.getTitle());
		System.out.println("주소:"+vo.getAddress());
		System.out.println("소개:"+vo.getMsg());
		
		
	}

}
