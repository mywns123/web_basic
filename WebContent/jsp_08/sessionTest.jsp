<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name;
	String id;
	if(session.getAttribute("name") !=null){
		name=(String)session.getAttribute("name");
	}else{
		name="세션 값 없음.";
	}	
	if(session.getAttribute("id") !=null){
		id=(String)session.getAttribute("id");
	}else{
		id="id값 없음.";
	}	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Test </title>
</head>
<body>
	<h2>세션 테스트</h2>
	<input type="button" onclick="location.href='sessionSet.jsp'" value="세션 값 저장">
	<input type="button" onclick="location.href='sessionDel.jsp'" value="세션 값 삭제">
	<input type="button" onclick="location.href='sessionInvalidate.jsp'" value="세션 초기화">
	<h3><%=name %></h3>
	<h3><%=id %></h3>
	<hr>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
	%>
	<%time.setTime(session.getCreationTime());%>
	<h4>세션 생성 시간 : <%=sdf.format(time) %></h4>
	<%time.setTime(session.getLastAccessedTime());%>
	<h4>마지막 접근 시간(1/1000초) : <%=sdf.format(time) %></h4>
	<h4>세션 ID : <%=session.getId() %></h4>	
</body>
</html>