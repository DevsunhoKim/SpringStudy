<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://unpkg.com/vue@3"></script>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$('#msg').keyup(function({
		$('#print').text($('#msg').val())
	})
});
</script> -->
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
</head>
<%--
  Vue: 1. 가상 롬을 사용=> 속도를 빠르게 처리
        mount => 가상 메모리에 저장
        String / StringBuffer
       
       2. 생명주기 => callBack
       3. 디렉티브 => 제어문
       4. 서버연동 => axois
       5. 출력형식 => {{}} / :src=
       6. 양방향   => v-model
       7. router => 화면 변경
       ================================ basic
       8. vue-bootstrap
       
       1. 생명주기 => vue3(react) , vuex(mvc)
         beforeCreate()
         created()
         ----------------------------- Vue 객체 생성
         beforeMount()
         mounted()
         ----------------------------- 가상 메모리에 HTML 태그를 올린 경우
           => $(function(){}) , window.onload
           => 서버에서 데이터를 읽는다 : 멤버 변수에 저장 
           => jquery 연동
         
         ------------------------------ 데이터 갱신
               => Component : Main / Sub => sub에 값을 전송 => $emit
         ------------------------------
         beforeDestroy()
         destroyed()
         ------------------------------ 메모리 해제
          
 --%>
<body>
<div class="container">
  <div class="row">
    <input type="text" size="30" class="input-sm" v-model="msg">
  </div>
  <div class="row">
   <div >{{msg}}</div>
  </div>
</div>
<script>
// VueJS 설정 하는 곳
// 뷰 객체 생성 
let app = Vue.createApp({
  data() {
    // 멤버 변수 설정
    return {
      msg: ''
    }
  },
  // callback 함수 => Vue에 의해서 자동으로 호출되는 함수
  beforeCreate(){
	  console.log("View 객체 생성 전 : beforeCreate() Call..")
  },
  created(){
	  console.log("View 객체 생성 완료 : created() Call..")
  },
  beforeMount(){
	  console.log("HTML과 데이터를 가상메모리에 올라가기 전 : beforeMount() Call..")  
  },
  mounted(){
	  console.log("가상 메모리에 HTML이 올라간 상태 : mounted() Call..")  
  },
  beforeUpdate(){
	  console.log("변경전 : beforeUpdated() Call..")
  },
  updated(){
	  console.log("변경 완료 : updated() Call..")  
  },
  beforeDestroy(){
	  console.log("View 메모리 해제 전 : beforeDestroy() Call..")
  },
  destroyed(){
	  console.log("View 메모리 해제 완료 : destroyed() Call..")  
  },
  // 사용자 메소드
  methods:{
	  
  }
}).mount('.container')
// 모든 데이터가 ROM에 저장
// 데이터 변경시에도 페이지 주소 유지
</script>
</body>
</html> 
