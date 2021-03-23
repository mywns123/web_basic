<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page영역과 request영역 비교</title>
</head>
<body>
pageValue =<%=pageContext.getAttribute("pageScope") %><br>
requestValue =<%=request.getAttribute("requestScope")%>
</body>
</html>