<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container{
   margin-top: 50px;
}
.row{
  margin: 0px auto;
  width: 960px;
}
</style>
</head>
<body>
 <div class="container">
  <div class="col-sm-9">
    <h3 class="text-center">�亯�� �Խ���</h3>
     <table class="table">
      <tr>
       <td>
        <a href="insert.do" class="btn btn-sm btn-info">����</a>
        </td>
        </tr>
     </table>
     <table class="table">
      <tr class="danger">
      <th width=10% class="text-center">��ȣ</th>
      <th width=55% class="text-center">����</th>
      <th width=10% class="text-center">�̸�</th>
      <th width=15% class="text-center">�ۼ���</th>
      <th width=10% class="text-center">��ȸ��</th>
      </tr>
      <c:forEach var="vo" items="${list }">
      <tr>
	      <td width=10% class="text-center">${vo.no }</td>
	      <td width=55% class="text-center">${vo.subject }</td>
	      <td width=10% class="text-center">${vo.name }</td>
	      <td width=15% class="text-center">${vo.dbday }</td>
	      <td width=10% class="text-center">${vo.hit }</td>
      </tr>      
      </c:forEach>
     </table>
     <table class="table">
      <tr>
       <td>
         <input type="checkbox" value="N" name="fd">�̸�
         <input type="checkbox" value="S" name="fd">����
         <input type="checkbox" value="C" name="fd">����
         <input type="text" class="input-sm" name="ss">
         <input type="submit" value="�˻�" class="btn-sm btn-info">
        </td>
       <td class="text-right">
        <a href="#" class="btn btn-sm btn-success">����</a>
        ${curpage } page / ${totalpage } pages
        <a href="#" class="btn btn-sm btn-success">����</a>
       </td>
      </tr>
     
     </table>
  </div>
  <div class="col-sm-3">
  
  </div>
 </div>

</body>
</html>