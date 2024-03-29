<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrapper row1">
  <header id="header" class="clear"> 
    <div id="logo" class="fl_left">
      <h1><a href="../main/main.do">실시간 맛집 추천</a></h1>
    </div>
    </header>
</div>
<div class="wrapper row2">
  <nav id="mainav" class="clear"> 
    <ul class="clear">
      <li class="active"><a href="../main/main.do">Home</a></li>
      <li><a class="drop" href="#">회원</a>
        <ul>
          <li><a href="pages/gallery.html">회원가입</a></li>
          <li><a href="pages/full-width.html">아이디찾기</a></li>
          <li><a href="pages/sidebar-left.html">비밀번호찾기</a></li>
        </ul>
      </li>
      <li><a class="drop" href="#">맛집</a>
        <ul>
          <li><a href="../food/food_list.do">맛집 목록</a></li>
          <li><a href="../food/food_find.do">맛집 찾기</a></li>
          <li><a href="pages/sidebar-left.html">맛집 추천</a></li>
          <li><a href="pages/sidebar-right.html">맛집 예약</a></li>
          <li><a href="pages/sidebar-right.html">맛집 레시피</a></li>
        </ul>
      </li>
      <li><a class="drop" href="#">레시피</a>
        <ul>
          <li><a href="../recipe/recipe_list.do">레시피</a></li>
          <li><a href="../recipe/chef_list.do">쉐프</a></li>
          <li><a href="pages/full-width.html">오늘의 레시피</a></li>
          <li><a href="pages/sidebar-left.html">오늘의 쉐프</a></li>
          <li><a href="pages/sidebar-right.html">레시피 만들기</a></li>
        </ul>
      </li>
      <li><a class="drop" href="#">커뮤니티</a>
        <ul>
          <li><a href="../freeboard/list.do">자유게시판</a></li>
          <li><a href="pages/full-width.html">공지사항</a></li>
          <li><a href="pages/sidebar-left.html">묻고답하기</a></li>
        </ul>
      </li>
      <li><a href="#">실시간 채팅</a></li>
      <li><a href="#">마이페이지</a></li>
      <!-- <li><a href="#">관리자페이지</a></li> -->
      <!-- <ul class="nav navbar-nav navbar-right"> -->
       <li class="nav navbar-nav navbar-right"><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <!-- </ul> -->
    </ul>
    
    </nav>
</div>
</body>
</html>