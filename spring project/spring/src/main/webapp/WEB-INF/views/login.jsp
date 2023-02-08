<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	문제 1  
</h1>
<!-- 
필드 이름을 썻을 때 필드를 직접 호출하는게 아니라 getter를 호출
xxx.name을 쓰면 xxx.getName()이 호출된다.
 -->
 
<form action="/spring/login" method="post">
	아이디 <input type="text" name="id"> <br>
	비밀번호 <input type="password" name="pw"> <br>
	<button>전송</button>
</form>

</body>
</html>
