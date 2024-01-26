package com.sist.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/*
 *                   FrontController : 요청 받기 => 응답 
 *  main.do ====> DispatcherServlet ===> HandlerMapping : Model 찾기
 *                                            | @GetMapping/@PostMapping
 *                                              ======================== BackEnd
 *                                              프로그래머  (Model) 찾기
 *                        |                     Model(Controller,Action)
 *                                                1) VO
 *                                                2) DAO
 *                                                3) Manager
 *                                                4) Service
 *                                               => 유지보수 (역할분담) 용이
 *                   preHandler     ==> @GetMapping("main.do")
 *                                           |
 *                                        return "main/main";
 *                                           | --> postHandle
 *                                        ViewResolver
 *                                           | request
 *                                           | ----> afterCompletion
 *                                          JSP => FrontEnd
 *                                           
 */
// <bean> 이용 => 자동 로그인 처리 , 아이디 저장
public class FoodInterceptor extends HandlerInterceptorAdapter{
	
	@Override // main.do 찾기 전에 수행 (모델 수행 전: 자동 로그인 , id 저장)
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===== preHandle() Call... =====");
		return super.preHandle(request, response, handler);
	}

	@Override // ViewResolver로 넘어가기 전에 사용
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===== postHandle() Call... =====");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override //jsp로 넘어가기 전에
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===== afterCompletion() Call... =====");
		super.afterCompletion(request, response, handler, ex);
	}
	
}
