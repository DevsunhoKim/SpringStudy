<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	  <div class="row">
	    <c:forEach var="vo" items="${list }">
	      <div class="col-md-3">
            <div class="thumbnail">
              <a href="detail.do?fno=${vo.fno }">
                <img src="https://www.menupan.com${vo.poster}" alt="Lights" style="width:100%">
                <div class="caption">
                  <p style="font-size:9px">${vo.name }</p>
                </div>
              </a>
            </div>
          </div>
	    </c:forEach>
      </div>
      <div style="height:20px"></div>
      <ul class="pagination">
        <li><a href="#">1</a></li>
        <c:forEach var="i" begin="${startPage }" end="${endPage }" >
         <li><a href="#">${i }</a></li>
        </c:forEach>
        <li><a href="#">5</a></li>
      </ul>
	</div>
</body>
</html>
