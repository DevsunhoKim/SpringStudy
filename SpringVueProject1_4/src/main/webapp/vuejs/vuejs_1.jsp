<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 
    Vue : Evan You(구글 => AngularJS:복잡하다)
          IBM => OS2 , MS DOS
           | 단순한 프레임워크 (VueJS => 1. 단순하다 , 가벼운 프레임워크
                                    2. 데이터를 효율적으로 다룰 수 있다
                                    3. 속도가 빠르다
                                    4. 코드의 재사용이 가능하다
                                    5. 컴포넌트 기반
                              => 전자상 거래 , 대시보드 ,블로그,뉴스
           | MVVM
             M (Model) : 데이터 저장 => data()
             V (View) : 화면 출력
                       {{}} , v-for,v-if,v-show-v-if v-else
             VM (View Model) : 상태(데이터 관리,연산처리)
                               생명주기
                               1. mounted : onload
                               2. updated : 수정
                               3. 사용자 정의
                                  methods:{
                                   => 이벤트 처리
                                  }
                               4. components:{
                                    기능 => 이미지 카드 ,애니메이션 => 재사용이 가능
                                  }
                               5. filter : 10000 => 10,000
                                 => computed : 계산된 경우
         ---------------------------------------------------------
         1. Vue 객체 생성 => 여러개 생성 가능
            ----
            | 범위 지정 ==> mount('태그명,클래스명,id명')
            
            let app=Vue.createApp({
                ----------------
                 Model => 데이터 관리
                 data(){
                   return{
                    fno:0,number
                    fd:'',String
                    list:[] Array
                    obj:{} , Object => 자바스크립트 객체
                    isShow:true , false
                   }==> 선언 / 초기화 : 서버(Spring/NodeJS)읽기가 불가능
                 }
                ----------------
                 ViewModel => 데이터 처리
                 1) 변수의 초기화 
                    => 서버나 파일
                    mounted(){
                     서버나 파일 읽기 => data에 저장된 변수에 초기화
                     ---
                     axios.get('서버URL',{
                                서버로 요청하는 데이터 설정
                                params:{
                                 fno:1
                                 id:'admin'
                                }
                              }).then(res(결과값을받는다)=>{
                                멤버 변수에 대입
                              })
                     axios.post
                   }
                ----------------
                
                ----------------
            })
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://unpkg.com/vue@3"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container{
	margin-top: 50px;
}
.row{
	margin: 0px auto;
	width: 960px;
}
.images:hover{
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
	  <div class="row">
	    <h3 class="text-center">{{msg}}</h3>
	    <input type="button" value="클릭" @click="change()"><br>
	    <input type="text" size=20 v-model="msg">
	  </div>
	</div>
	<script>
	 let app=Vue.createApp({
		 // 데이터 설정
		 data(){
			 return {
				 msg:"Hello Vue"
			 }
		 },
		 // 데이터 처리 /초기화
		 methods:{
			 change(){
				 this.msg="변경됨"
				 
			 }
		 }
	 }).mount('.container')
	</script>
</body>
</html>