<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="std" class="web_basic.jsp_07.Student" scope="page"/>
<jsp:setProperty property="*" name="std"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈 테스트</title>
</head>
<body>
	<h1>성적</h1>
	<b>번호:</b><%=std.getStdNO()%><br>
	<b>성명:</b><%=std.getStdName()%><br>
	<b>국어:</b><%=std.getKor()%><br>
	<b>영어:</b><%=std.getEng()%><br>
	<b>수학:</b><%=std.getMath()%><br>
	<b>총점:</b><%=std.getTotal()%><br>
	<b>평균:</b><%=std.getAvg()%><br>
	
	<hr>
	<b>번호:</b><jsp:setProperty property="stdNO" name="std"/><br>
	<b>성명:</b><jsp:setProperty property="stdName" name="std"/><br>
	<b>국어:</b><jsp:setProperty property="kor" name="std"/><br>
	<b>영어:</b><jsp:setProperty property="eng" name="std"/><br>
	<b>수학:</b><jsp:setProperty property="math" name="std"/><br>
	<b>총점:</b><jsp:setProperty property="total" name="std"/><br>
	<b>평균:</b><jsp:setProperty property="avg" name="std"/><br>	
</body>
</html>