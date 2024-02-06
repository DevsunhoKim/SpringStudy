package com.sist.chat;
import java.util.*;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
@ServerEndpoint("/site/chat/chat-ws")
public class ChatServer {
	// 저장 => 접속자 정보 저장
	private static List<Session> users=new ArrayList<Session>();
	// webSocket에 존재하는 Session
	// 클라이언트가 접속했을 때
	@OnOpen
	public void onOpen(Session session)
	{
	   users.add(session);
	   System.out.println("클라이언트 접속:"+session.getId());
	   
	}
	// 클라이언트 퇴장 시
	@OnClose
	public void onClose(Session session)
	{
		users.remove(session);
		System.out.println("클라이언트 퇴장:"+session.getId());
	}
	@OnMessage
	public void onMessage(String message,Session session) throws Exception
	{
		System.out.println(session.getId()+"님의 메시지:"+message);
		Iterator<Session> iter=users.iterator();
		while(iter.hasNext())
		{
			iter.next().getBasicRemote().sendText(message);
		}
	}
}
