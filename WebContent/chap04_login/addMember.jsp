<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>    
<jsp:useBean id="member" class="web_basic.chap04_login.Member"></jsp:useBean>
<jsp:setProperty name="member" property="*"/>
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
			<td><jsp:getProperty name="member" property="name"/></td>
		</tr>
		<tr>
			<td> 아이디 </td>
			<td><jsp:getProperty name="member" property="userId"/></td>
		</tr>
		<tr>
			<td> 별명 </td>
			<td><jsp:getProperty name="member" property="nickName"/></td>
		</tr>
		<tr>
			<td> 비밀번호</td>
			<td><jsp:getProperty name="member" property="pwd"/></td>
		</tr>
		<tr>
			<td> 이메일 </td>
			<td><jsp:getProperty name="member" property="email"/></td>
		</tr>
		<tr>
			<td> 전화번호</td>
			<td><jsp:getProperty name="member" property="phone"/></td>
		</tr>
	</table>
</body>
</html>