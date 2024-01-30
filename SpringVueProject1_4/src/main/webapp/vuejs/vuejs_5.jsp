<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://unpkg.com/vue@3"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container {
	margin-top: 50px;
}
.row {
	margin: 0px auto;
	width: 960px;
}
</style>
</head>
<body>
  <div class="container">
    <div class="row">
     Start:<input type="text" size="10" class="input-sm" v-model="startPage"><br>
     End:<input type="text" size="10" class="input-sm" v-model="endPage">
    </div>
   <div class="row">
     <div class="text-center">
       <ul class="pagination">
         <li><a href="#">«</a></li>
         <li v-for="i in range(startPage, endPage)"><a href="#">{{ i }}</a></li>
         <li><a href="#">»</a></li>
       </ul>
     </div>
   </div>
  </div>
  <script>
   let app = Vue.createApp({
      data() {
         return {
            startPage: 1,
            endPage: 10
         };
      },
      methods: {
         range(start, end) {
            let arr = [];
            let length = end - start;
            for (let i = 0; i <= length; i++) {
               arr[i] = start;
               start++;
            }
            return arr;
         }
      }
   });

   // 마운트할 요소 지정
   app.mount('.container');
  </script>
</body>
</html>