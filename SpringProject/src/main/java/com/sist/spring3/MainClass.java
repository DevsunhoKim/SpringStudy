package com.sist.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
/*
 *  �������� ������Ʈ�� �ʿ��� Ŭ������ ��Ƽ� ����
 *                     =============== �����̳�
 *    => �淮 �����̳�
 *    => �ܼ��� ���� ����
 *    => ���̺귯�� ����
 *     => Open Source 
 *     => Core 
 *     => �����̳� Ŭ���� 
 *          BinFactory => core
 *              | 
 *        ApplicationContext => core / AOP 
 *              |
 *      WebApplicationContext => core / AOP / MVC
 *      
 *   �����̳�
 *   ������Ʈ : �����ڰ� ���� Ŭ���� �� �� (����� �����ϴ� Ŭ����)
 *            => ������Ʈ �������� ��� ���� => �����̳�
 *   
 *   �����̳��� ����
 *   =============
 *    1. ��ü ����         ==> new�� ����ؾ� �Ǵ� Ŭ����
 *                          ~VO �� ��������
 *    2. ��ü ������ �ʱ�ȭ ==> DI
 *    3. ��ü �Ҹ�
 *    ============= ��ü�� ���� �ֱ�
 *    4. ��ü�� ã���ִ� ���� (DL)
 *    
 *    
 *    DL / DI => core
 *    
 *    Spring : Ŭ���� ������ / ������� �ʱ�ȭ / �޼ҵ� ȣ�� / ������
 *                        ===============================
 *                          | DI �� ���� => XML
 *  
 *  1. Ŭ���� ���� 
 *   => Ŭ���� ��� => ã��
 *   ===================== DL
 *  2. ��ü �����ÿ� �ʿ��� ������ ����
 *  ====================== DI
 *   
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO SPRING");
		// ���������� ����ϴ� default ���� / classpath
		// classpath=>src/main/java
		// 1. XML �Ľ�
		// 2. �����̳� => XML ����
		ApplicationContext app=
				new ClassPathXmlApplicationContext("application.xml");
		// ��ϵ� Ŭ������ ��Ƽ� �����ϴ� ������ Ŭ���� => �����̳�
		// ��ü �޸� �Ҵ� => ���
		/*
		 *  class ApplicationContext
		 *  {
		 *     Map map =new HashMap();
		 *     map.put("id��",Class.forName("Ŭ������"))
		 *     
		 *     public Object getBean(String key)
		 *     {
		 *          return map(key)
		 *     }
		 *  }
		 */
		
		// ��ü ã�� => DL
		Board board=(Board)app.getBean("board");
		System.out.println("board="+board);
		board.board_list();
		
		Board board1=(Board)app.getBean("board");
		System.out.println("board1="+board1);
		board1.board_list();
		
		Board board2=(Board)app.getBean("board");
		System.out.println("board2="+board2);
		board2.board_list();
		
		Notice notice=(Notice)app.getBean("notice");
		Member member=(Member)app.getBean("member");
	
	}

}
