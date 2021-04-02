<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>if tag</title>
</head>
<body>
	<c:if test="true">
		무조건 수행<br>
	</c:if>
	
	param.name = ${param.name}<br>
	param.age = ${param.age}<br>
	
	<c:if test="${param.name == 'ksk'}">
		name파라미터의 값이 ${param.name}입니다.<br>
	</c:if>
	
	<c:if test="${18 < param.age}">
		당신의 나이는 18세 이상입니다.<br>
	</c:if>
</body>
</html>