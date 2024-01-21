package com.sist.web;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.*;

@Controller // 브라우저와 연결되는 클래스
public class FoodController {
	@Autowired
	private FoodDAO dao;
	
	@RequestMapping("food/list.do")
	// 페이지는 처음 값이 null 이라서 String으로 매개변수 포함
	public String food_list(String page,Model model)
	{
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		int rowSize=12;
		int start=(rowSize*curpage)-(rowSize-1);
		int end=rowSize*curpage;
		List<FoodVO> list=dao.foodListData(start, end);
		int totalpage=dao.foodTotalPage();
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage)
			endPage=totalpage;
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("list", list);
		
		
		return "food/list"; // jsp 파일 명
	}
	
	@RequestMapping("food/detail.do")
	public String food_detail(int fno,Model model)
	// Parse 가 완료된 형태로 넘어옴 String fno 사용 안해도 됨
	// Map에도 Model이 포함되나? Date 도 형변환이 되나?
	{
		FoodVO vo=dao.foodDetailData(fno);
		model.addAttribute("vo", vo);
		return "food/detail";
	}
	
	@RequestMapping("food/find.do")
	public String food_find()
	{
		return "food/find";
	}
}
