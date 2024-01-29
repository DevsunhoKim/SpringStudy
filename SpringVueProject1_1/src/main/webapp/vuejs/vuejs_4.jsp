<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
  .container{
    margin-top: 50px;
  }
  .row {
    margin: 0px auto;
    width: 960px;
  }
</style>
<script src="https://unpkg.com/vue@3"></script>
</head>
<!-- 
 디렉티브 : 태그안에 포함
  => v-for
  => v-if
  => v-show
  => v-model
  => v-bind => (속성값 처리)
  => v-if v-else
  => v-if v-else if ....
  => v-on:이벤트 => v-on:click v-on:keydown
 -->
<body>
	<div class="container">
	 <div class="row">
	  <div class="col-sm-7">
	    <table class="table">
	     <tr>
	      <th class="text-center">순위</th>
	      <th class="text-center"></th>
	      <th class="text-center">영화명</th>
	      <th class="text-center">감독</th>
	      <th class="text-center">장르</th>
	     </tr>
	     <tr v-for="vo in movie_list">
	      <td class="text-center">{{vo.rank}}</td>
	      <td class="text-center"></td>
	      <td class="text-center"></td>
	      <td class="text-center"></td>
	      <td class="text-center"></td>
	     </tr>
	    </table>
	  </div>
	  <div class="col-sm-5" v-if="isShow">
	  	<table class="table">
	  	 <tr>
	  	  <td width=30% class="text-center" rowspan="7">
	  	   <img :src="">
	  	  </td>
	  	 </tr>
	  	</table>
	  </div>
	 </div>
	</div>
	<script>
	
	</script>
</body>
</html>