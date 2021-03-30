<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	
	String filename1 = request.getParameter("filename1");
	String filename2 = request.getParameter("filename2");
	String origfilename1 = request.getParameter("origfilename1");
	String origfilename2 = request.getParameter("origfilename2");
	
	if(name == null){
		name = (String)request.getAttribute("name");
		subject = (String)request.getAttribute("subject");
		
		filename1 = (String)request.getAttribute("filename1");
		filename2 = (String)request.getAttribute("filename2");
		origfilename1 = (String)request.getAttribute("origfilename1");
		origfilename2 = (String)request.getAttribute("origfilename2");		
	}


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	올린사람 : <%=name %><br>
	제목 : <%=subject %><br>
	파일명1: <a href="/web_basic/upload/<%=filename1 %>">
			<%=origfilename1 %></a><br>
	파일명2: <a href="/web_basic/upload/<%=filename2 %>">
			<%=origfilename2 %></a><p>
	<hr>
	파일명1: <a href="file_down.jsp?file_name=<%=filename1 %>">
			<%=origfilename1 %></a><br>
	파일명2:<a href="file_down.jsp?file_name=<%=filename2 %>">
			<%=origfilename2 %></a><p>
</body>
</html>