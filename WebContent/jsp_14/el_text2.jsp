<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 내장 객체 사용 예제</title>
</head>
<body>
	<h3>${sessionScope.test}</h3>
	<h3>${param.name}</h3>
</body>
</html>