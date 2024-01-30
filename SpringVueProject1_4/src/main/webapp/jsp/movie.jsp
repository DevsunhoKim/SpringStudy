<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.net.*,org.jsoup.Jsoup"%>
<%
    String data = "";
    try {
        String no = request.getParameter("no");
        String[] movies = {"", "searchMainDailyBoxOffice.do", "searchMainRealTicket.do", "searchMainDiverRealTicket.do"};
        String url = "https://www.kobis.or.kr/kobis/business/main/";
        Document doc = Jsoup.connect(url + movies[Integer.parseInt(no)]).get();
        // System.out.println(doc.toString());
      
        data = doc.toString();
        data = data.substring(data.indexOf("["), data.lastIndexOf("]") + 1);
    } catch (Exception ex) {
        ex.printStackTrace(); // 오류 발생 시 오류 내용을 콘솔에 출력
    }
%>
<%= data %>