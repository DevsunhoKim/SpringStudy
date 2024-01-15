package com.sist.di;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CommonsDAO {
	private Connection conn;
	private PreparedStatement ps;
	private String url,username,password;
	
	public CommonsDAO(String driver)
	{
		try
		{
			Class.forName(driver);
			
		}catch(Exception ex) {}
	}
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// ����
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(url,username,password);
		}catch(Exception ex) {}
	}
	// ����
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
}
