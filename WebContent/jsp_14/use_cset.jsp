<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="web_basic.jsp_13.erp.Title"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% Title t= new Title();%>
<!-- t.settNo(1),t.settName() -->
<c:set target="<%=t %>" property="tNo" value="1"/>
<c:set target="<%=t %>" property="tName" value="사장"/>
<%=t.gettNo() %><br>
<%=t.gettName() %><br>
<c:set var="tt" value="<%=t %>"/>
<c:out value="${tt}"/> <!--toString  -->

<hr>
<c:set var="m" value="<%=t %>"/>
직책번호 : ${m.tNo} <br>
직책명 : ${m.tName} <br>

<hr>
<c:set target="${m}" property="tNo" value="2"/>
<c:set target="${m}" property="tName" value="부장"/>
직책번호 : ${m.tNo} <br>
직책명 : ${m.tName} <br> 

<hr>
<% Map<String,String> prop = new HashMap<>(); %>
<!-- prop.put("키","값") -->
<c:set target="<%=prop %>" property="color" value="김상건"/>
<%=prop.get("color") %>
<br>
<c:set var="pro" value="<%=prop %>"/>
${pro.color}

<hr>
<c:set var="name" value="영남인재교육원"/> <!-- String name = 영남인재교육원"; -->
학교이름 : ${name}<br>

<% Title t2= new Title();%>
<c:set var="title" value="<%=t2%>"/> <!-- Title title = t2;  -->

<c:set target="${title}" property="tName" value="과장"/> <!-- title.settName("과장") -->
직책 명 : ${title.tName}<br> <!--title.tName()  -->
<c:set target="${title}" property="tNo" value="3"/><!-- title.settNo("3") -->
직책번호 : ${title.tNo}

<hr>
<%
	Title test = new Title();
	test.settNo(4);
	test.settName("대리");
%>
직책 번호 : <%=test.gettNo() %><br>
직책 명 : <%=test.gettName() %><br>

<% Title test2 = new Title(); %>
<c:set var="mm" value="<%=test2 %>"/>
<c:set target="${mm}" property="tNo" value="5"/> 
<c:set target="${mm}" property="tName" value="사원"/> 
직책번호 : ${mm.tNo}<br>
직책명 : ${mm.tName}<br> 
<c:out value="${mm.tNo}"/><br> 
<c:out value="${mm.tName}"/>

<hr>
변수삭제
<c:remove var="mm"/> <!-- mm==null;  -->
<c:out value="${mm}"/><br> 



