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
    width: 800px;
  }
</style>
<script src="https://unpkg.com/vue@3"></script>
</head>
<body>
	<div class="container">
	 <div class="row">
	  	<table class="table">
	  	 <tr>
	  	  <th class="text-center">사번</th>
	  	  <th class="text-center">이름</th>
	  	  <th class="text-center">성별</th>
	  	  <th class="text-center">부서</th>
	  	  <th class="text-center">근무지</th>
	  	 </tr>
	  	 <tr v-for="vo in sawon">
	  	  <th class="text-center" v-if="vo.loc=='서울'">{{vo.sabun}}</th>
	  	  <th class="text-center" v-if="vo.loc=='서울'">{{vo.name}}</th>
	  	  <th class="text-center" v-if="vo.loc=='서울'">{{vo.sex}}</th>
	  	  <th class="text-center" v-if="vo.loc=='서울'">{{vo.dept}}</th>
	  	  <th class="text-center" v-if="vo.loc=='서울'">{{vo.loc}}</th>
	  	 </tr>
	  	</table>
	 </div>
	</div>
<script>
 let app=Vue.createApp({
	 data(){
		 return {
			 sawon:[
				 {"sabun":1,"name":'홍길동',"sex":'남자',"dept":'개발부',"loc":'서울'},
				 {"sabun":2,"name":'심청이',"sex":'여자',"dept":'기획부',"loc":'부산'},
				 {"sabun":3,"name":'박문수',"sex":'남자',"dept":'영업부',"loc":'서울'},
				 {"sabun":4,"name":'이순신',"sex":'남자',"dept":'총무부',"loc":'서울'},
				 {"sabun":5,"name":'강감친',"sex":'남자',"dept":'자재부',"loc":'강원'}
			 ]
		 } 
	 }
 }).mount('.container')
</script>
</body>
</html>