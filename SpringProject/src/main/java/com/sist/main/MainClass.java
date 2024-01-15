package com.sist.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\SpringDev\\SpringStudy\\SpringProject\\src\\main\\java\\com\\sist\\main\\app.xml";
		ApplicationContext app=
				new ApplicationContext(path);
		
		
		Board board=(Board)app.getBean("board");
		System.out.println(board);
		board.board_list();
		
		
		Board board1=(Board)app.getBean("board");
		System.out.println(board1);
		board1.board_list();
		
		Board board2=(Board)app.getBean("board");
		System.out.println(board2);
		board2.board_list();
	}

}
