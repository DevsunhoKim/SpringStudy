package com.sist.main;
import java.util.*;
import com.sist.dao.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 *  OOP => 반복 소스가 있는 경우 
 *         => 한 개의 클래스 안에서 => 메소드 생성
 *         => 여러 개의 클래스에서 적용 => 클래스화
 *         => 자동 호출 (AOP)
 *  AOP => OOP를 보완한 패턴 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		
		MyDAO dao=(MyDAO)app.getBean("dao");
		dao.insert();
		System.out.println("========================");
		dao.select();
		System.out.println("========================");
		dao.update();
		System.out.println("========================");
		dao.delete();
	}

}
