<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div class="container">
   <div class="row">
    <c:forEach var="vo" items="${list }">
      <div class="col-md-3">
       <a href="#">
        <div class="panel panel-primary">
          <div class="panel-heading">${vo.title }</div>
          <div class="panel-body text-center">
           <img src="${vo.poster }" style="width:180px;height:200px" class="img-rounded">
          </div>
         </div>
        </a>
      </div>
    </c:forEach>
   </div>
   <div style="height: 20px"></div>
   <div class="row">
     <div class="text-center">
       <ul class="pagination">
         <c:if test="${startPage>1 }">
		  <li><a href="../seoul/list.do?page=${startPage-1 }">&lt;</a></li>
		 </c:if>
		 <c:forEach var="i" begin="${startPage }" end="${endPage }">
		   <li ${curpage==i?"class=active":"" }><a href="../seoul/list.do?page=${i }">${i }</a></li>
		 </c:forEach>
		 <c:if test="${endPage<totalpage }">
		  <li><a href="../seoul/list.do?page=${endPage+1 }">&gt;</a></li>
		 </c:if>
	  </ul>
     </div>
   </div>
  </div>