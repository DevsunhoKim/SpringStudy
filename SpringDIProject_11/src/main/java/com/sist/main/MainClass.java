package com.sist.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.sist.dao.*;
@Component
@Qualifier("memberDAO") // 특정 객체를 선택할 때 사용
public class MainClass {
	@Autowired
	private OracleDB ob;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mainClass");
		mc.ob.display();
	}

}
/*
 *  @Component 
 *   => 사용 위치 ==> 클래스에만 적용
 *   
 *   @Autowired
 *   Target(value={CONSTRUCTOR, METHOD, PARAMETER, FIELD, ANNOTATION_TYPE})
 *                   생성자      메소드    매개변수           
 *
 */
