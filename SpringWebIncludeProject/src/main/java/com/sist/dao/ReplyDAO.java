package com.sist.dao;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
import com.sist.vo.*;
/*
 *        
 *  *.do ====>DispatcherServlet
 *                   | => preHandle
 *                   | HandlerMapping
 *               @Controller / @RestController
 *                   | => postHandle()
 *                   | Model=request => ViewResolver
 *                   | => afterCompletion() => 권한
 *                  JSP
 *   
 *   => AOP
 *      void aaa()
 *                   
 */
@Repository
public class ReplyDAO {
	@Autowired
	private ReplyMapper mapper;
	
	public void replyInsert(ReplyVO vo)
	{
		mapper.replyInsert(vo);
	}
	public List<ReplyVO> replyListData(int fno)
	{
		return mapper.replyListData(fno);
	}
	public void replyUpdate(ReplyVO vo)
	{
		mapper.replyUpdate(vo);
	}
	
	public void replyDelete(int no)
	{
		mapper.replyDelete(no);
	}
}
