package com.sist.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sist.dao.DataBoardDAO;
import com.sist.vo.DataBoardVO;
// Vue와 데이터 통신
// Vue / React ==> Router => 데이터 통신(송수신) => 화면 변경 => Spring
@RestController
public class DataBoardRestController {
   @Autowired
   private DataBoardDAO dao;

   @GetMapping(value="databoard/list_vue.do",produces = "text/plain;charset=UTF-8")
   public String databoard_list(int page) throws Exception
   {
	   int rowSize=10;
	   int start=(rowSize*page)-(rowSize-1);
	   int end=rowSize*page;
	   List<DataBoardVO> list=dao.databoardListData(start, end);
	   ObjectMapper mapper=new ObjectMapper();
	   String json=mapper.writeValueAsString(list);
	   return json;
   }
   @GetMapping(value="databoard/page_vue.do",produces = "text/plain;charset=UTF-8")
   public String databoard_page(int page) throws Exception
   {
	   int totalpage=dao.databoardTotalPage();
	   Map map=new HashedMap();
	   map.put("curpage", page);
	   map.put("totalpage", totalpage);
	   ObjectMapper mapper=new ObjectMapper();
	   String json=mapper.writeValueAsString(map);// {curpage:1,totalpage:10}
	   return json;
   }

   @PostMapping(value="databoard/insert_vue.do",produces = "text/plain;charset=UTF-8")
   public String databoard_insert(DataBoardVO vo,HttpServletRequest request)
   {
	   // C:\springDev\springStudy\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\SpringVueMiddleProject_2
	   String result="";
	   try
	   {
		   String path=request.getSession().getServletContext().getRealPath("/")+"upload\\";
		   path=path.replace("\\", File.separator);// 운영체제의 호환
		   // Hosting => AWS(리눅스)
		   File dir=new File(path);
		   if(!dir.exists())
		   {
			   dir.mkdir();
		   }

		   List<MultipartFile> list=vo.getFiles();//임시 저장
		   if(list==null) // 업로드가 없는 상태
		   {
			   vo.setFilename("");
			   vo.setFilesize("");
			   vo.setFilecount(0);
		   }
		   else //업로드가 있는 상태
		   {
			   String filename="";
			   String filesize="";
			   for(MultipartFile mf:list)
			   {
				   String name=mf.getOriginalFilename();
				   File file=new File(path+name);
				   mf.transferTo(file);//  업로드

				   filename+=name+",";// a.jpg,b.jpg,
				   filesize+=file.length()+",";
			   }
			   filename=filename.substring(0,filename.lastIndexOf(","));
			   filesize=filesize.substring(0,filesize.lastIndexOf(","));
			   vo.setFilename(filename);
			   vo.setFilesize(filesize);
			   vo.setFilecount(list.size());
		   }
		   dao.databoardInsert(vo);
		   result="yes";
	   }catch(Exception ex)
	   {
		   result=ex.getMessage();
	   }
	   return result;
   }
   
   @GetMapping(value = "databoard/detail_vue.do",produces = "text/plain;charset=UTF-8")
   public String databoard_Detail(int no) throws Exception
   {
	   DataBoardVO vo=dao.databoardDetailData(no);
	   ObjectMapper mapper=new ObjectMapper();
	   String json=mapper.writeValueAsString(vo);
	   return json;
   }
   
   @GetMapping(value = "databoard/download.do",produces = "text/plain;charset=UTF-8")
   public void databoard_download(String fn,HttpServletRequest request,HttpServletResponse response)
   {
	   String path=request.getSession().getServletContext().getRealPath("/")+"upload\\";
	   path=path.replace("\\", File.separator);
	   
	   try
	   {
		   File file=new File(path+fn);
		   response.setHeader("Content-Disposition", "attachment;filename="
				   +URLEncoder.encode(fn,"UTF-8"));
		   response.setContentLength((int)file.length());
		   // 다운로드 창을 보여준다
		   
		   BufferedInputStream bis=
				   new BufferedInputStream(new FileInputStream(file));
		   // 서버에서 파일을 읽어 온다
		   BufferedOutputStream bos=
				   new BufferedOutputStream(response.getOutputStream());
		   // 클라이언트 복사 영역
		   int i=0;
		   byte[] buffer=new byte[1024];
		   while((i=bis.read(buffer,0,1024))!=-1)
		   {
			   bos.write(buffer,0,i);
		   }
		   bis.close();
		   bos.close();
	   }catch(Exception ex) {}
   }
}




