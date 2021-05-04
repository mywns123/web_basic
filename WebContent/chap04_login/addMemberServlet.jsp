

<%@page import="web_basic.chap04_login.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Member member = (Member)request.getAttribute("member");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 완료된 회원 정보</title>
</head>
<body>
	<h2>입력 완료된 회원 정보</h2>
	<table>
		<tr>
			<td> 이름 </td>
			<td><%=member.getName() %></td>
		</tr>
		<tr>
			<td> 아이디 </td>
			<td><%=member.getUserId() %></td>
		</tr>
		<tr>
			<td> 별명 </td>
			<td><%=member.getNickName()%></td>
		</tr>
		<tr>
			<td> 비밀번호</td>
			<td><%=member.getPwd() %></td>
		</tr>
		<tr>
			<td> 이메일 </td>
			<td><%=member.getEmail() %></td>
		</tr>
		<tr>
			<td> 전화번호</td>
			<td><%=member.getPhone() %></td>
		</tr>
	</table>
</body>
</html>