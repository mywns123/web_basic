<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attribute Test</title>
</head>
<body>
	<h2>영역과 속성 테스트</h2>
	<%
	request.setCharacterEncoding("utf-8");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	String tel = request.getParameter("tel");
	session.setAttribute("email", email);
	session.setAttribute("address", address);
	session.setAttribute("tel", tel);
	
	String name = (String)application.getAttribute("name");	
	%>
	
	<h3><%=name %>님의 정보가 모두 저장되었습니다.</h3>
	<a href="attributeTest3.jsp">확인하러가기</a>	
</body>
</html>