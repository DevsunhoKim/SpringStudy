<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	    <table class="table">
	      <tr>
	       <td width="30%" rowspan="6">
	        <img src="https://www.menupan.com${vo.poster}" style=width:100%>
	       </td>
	       <td colspan="2"><h3>${vo.name }</h3></td>
	      </tr>
	      <tr>
	       <th width=10%>이름</th>
	       <td width=60%></td>
	      </tr>
	       <tr>
	       <th width=10%>주소</th>
	       <td width=60%>${vo.name }</td>
	      </tr>
	       <tr>
	       <th width=10%>영업시간</th>
	       <td width=60%>${vo.time }</td>
	      </tr>
	       <tr>
	       <th width=10%>가격대</th>
	       <td width=60%>${vo.price }</td>
	      </tr>
	       <tr>
	       <th width=10%>음식종류</th>
	       <td width=60%>${vo.type }</td>
	      </tr>
	      <tr>
	       <td colspan="3">${vo.content }</td>
	      </tr>
	       <tr>
	       <td colspan="3" class="text-ringt">
	       <input type="button" class="btn-sm btn-danger"
	        value="목록" onclick="javascript:history.back()">
	       </td>
	      </tr>
	    </table>
	  </div>
	</div>
</body>
</html>