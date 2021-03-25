<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="std" class="web_basic_jsp_07.Student" scope="page"/>
<jsp:setProperty property="stdNO" name="std" value="11"/>
<jsp:setProperty property="stdName" name="std" value="이나"/>
<jsp:setProperty property="kor" name="std" value="80"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈 사용예제</title>
</head>
<body>
	<b>자바빈 사용예제</b>
	<h3>학번 : <%=std.getStdNO() %></h3>
	<h3>성명 : <%=std.getStdName() %></h3>
	<h3>국어 : <%=std.getKor() %></h3>	
</body>
</html>