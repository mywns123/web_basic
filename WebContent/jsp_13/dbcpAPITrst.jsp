<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;

	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/dbstudy");
		conn = ds.getConnection();
		
		out.println("<h3>연결 되었습니다.</h3>");
		String sql = "select tno, tname from title";
	}catch(Exception e){
		out.println("<h3>연결에 실패하였습니다.</h3>");
		e.printStackTrace();
	}
%>  
    