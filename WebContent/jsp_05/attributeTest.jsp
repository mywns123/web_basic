<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String)application.getAttribute("name");
	String id = (String)application.getAttribute("id");
%>
	<%=name %><br><%=id %>
</body>
</html>