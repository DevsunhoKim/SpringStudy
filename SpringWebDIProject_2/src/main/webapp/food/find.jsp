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
<script src="http://unpkg.com/vue@3"></script>
<script src="http://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<div class="container">
 <div class="row">
  <input type="text" size=20 class="input-sm"
    v-model="fd">
  <input type="button" value="검색" class="btn-sm btn-danger" @click="find()">
 </div>
 <div style="height:20px"></div>
 <div class="row">
   <div class="col-md-3" v-for="vo in find_data">
            <div class="thumbnail">
              <a href="#">
                <img :src="'https://www.menupan.com' + vo.poster"alt="Lights" style="width:100%">
                <div class="caption">
                  <p style="font-size:9px">{{vo.name }}</p>
                </div>
              </a>
            </div>
          </div>
 </div>
</div>
<script>
 const {createApp} =Vue
 createApp({
	 data(){
		 return {
			 // 멤버변수
			 fd:'마포',
			 find_data:[]
		 }
	 },
	 mounted(){
		axios.get('http://localhost:8080/web/food/find_vue.do',{
			params:{
				fd:this.fd,
				page:1
			}
		}) .then(response=>{
			this.find_data=response.data
			console.log(respons.data)
		})
	 },
	 methods:{
		 find(){
			 axios.get('http://localhost:8080/web/food/find_vue.do',{
					params:{
						fd:this.fd,
						page:1
					}
				}) .then(response=>{
					this.find_data=response.data
					console.log(respons.data)
				})
		 }
	 }
 }).mount('.container')
</script>
</body>
</html>