<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
 	 <h3 class="text-center">�۾���</h3>
 	  <form method="post" action="insert_ok.do">
 	  <table class="table">
 	   <tr>
 	    <th width=15% class="text-right">�̸�</th>
 	    <th width=85%>
 	     <input type="text" name=name size=15 class="input-sm">
 	    </th>
 	    </tr>
 	     <tr>
 	    <th width=15% class="text-right">����</th>
 	    <th width=85%>
 	     <input type="text" name=subject size=15 class="input-sm">
 	    </th>
 	    </tr>
 	     <tr>
 	    <th width=15% class="text-right">����</th>
 	    <th width=85%>
 	       <textarea rows="5" cols="52" name=content></textarea>
 	    </th>
 	    </tr>
 	     <tr>
 	    <th width=15% class="text-right">��й�ȣ</th>
 	    <th width=85%>
 	     <input type="password" name=pwd size=10 class="input-sm">
 	    </th>
 	    </tr>
 	    <tr>
 	     <td colspan="2" class="text-center">
 	      <input type="submit" value="�۾���" class="btn-sm btn-info">
 	      <input type="button" value="���" class="btn-sm btn-info"
 	      onclick="javascript:history.back()">
 	     </td>
 	     </tr>
 	  </table>
 	  </form>
 	</div>
 	<div class="col-sm-3">
 	 
 	</div>
 </div>
</body>
</html>