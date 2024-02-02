<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script src="https://unpkg.com/vue@3"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
    <div class="container" id="logApp"> 
        <c:if test="${sessionScope.id == null}">
            <div class="row">
                <div class="text-right" v-if="!isLogin">
                    ID:<input type="text" ref="id" class="input-sm" v-model="id"> 
                    PW:<input type="password" ref="pwd" class="input-sm" v-model="pwd"> 
                    <input type="button" value="로그인" class="input-sm" @click="login()"> 
                </div>
            </div>
        </c:if>
        <c:if test="${sessionScope.id != null}">
            <div class="row">
                <div class="text-right">
                    <form method="get" action="../member/logout.do">
                        ${sessionScope.name}님 로그인되었습니다
                        <input type="button" value="로그아웃" class="input-sm" @click="logout()"> 
                    </form>
                </div>
            </div>
        </c:if>
    </div>
    <script>
        let logApp = Vue.createApp({
            data() {
                return {
                    id: '',
                    pwd: '',
                    msg: '',
                    isLogin: ${sessionScope.id == null ? 'false' : 'true'}
                }
            },
            mounted() {

            },
            updated() {

            },
            methods: {
                login() {
                    if (this.id === "") {
                        this.$refs.id.focus();
                        return;
                    }
                    if (this.pwd === "") {
                        this.$refs.pwd.focus();
                        return;
                    }

                    axios.get("../member/login_vue.do", {
                        params: {
                            id: this.id,
                            pwd: this.pwd
                        }
                    }).then(response => {
                        if (response.data === 'NOID') {
                            this.id = "";
                            this.pwd = "";
                            this.$refs.id.focus();
                        } else if (response.data === 'NOPWD') {
                            this.pwd = "";
                            this.$refs.pwd.focus();
                        } else {
                            location.href = "../food/list.do";
                        }
                    });
                },
                logout() {
                    location.href = "../member/logout.do";
                }
            }
        }).mount('#logApp')
    </script>
</body>
</html>
