package com.sist.temp;
import java.io.*;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String path="C:\\SpringDev\\SpringStudy\\SpringDIProject_12\\src\\main\\java";
			String pack="com.sist.temp";
			path=path+"\\"+pack.replace(".","\\");
			File dir=new File(path);
			File[] files=dir.listFiles();
			for(File f:files)
			{
				System.out.println(f.getName());
				String ff=f.getName();
				String ext=ff.substring(ff.lastIndexOf(".")+1);
				if(ext.equals("java"))
				{
					String ss=ff.substring(0,ff.lastIndexOf("."));
					String res=pack+"."+ss;
					System.out.println(res);
				}
			}
			
		}catch(Exception ex) {}
	}

}
