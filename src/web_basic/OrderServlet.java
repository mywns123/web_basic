package web_basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/orderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String tell = request.getParameter("tell");
		
		String addr = request.getParameter("addr");
		String tel2 = request.getParameter("tel2");
		String comment = request.getParameter("comment");
		
		String[] fruit = request.getParameterValues("fruit");
		String fruit1 = request.getParameter("fruit1");
		String fruit2 = request.getParameter("fruit2");
		String fruit3 = request.getParameter("fruit3");
		
		/*
		 * int fruit1 = Integer.parseInt(request.getParameter("fruit1")); int fruit2 =
		 * Integer.parseInt(request.getParameter("fruit2")); int fruit3 =
		 * Integer.parseInt(request.getParameter("fruit3"));
		 */
		
		out.println("<h2>개인정보</h2><hr>");
		out.println("이름 : " + uname + "<br>");
		out.println("연락처 : " + tell + "<br>");
		out.println("<h2>배송지정보</h2><hr>");
		out.println("주소 : " + addr + "<br>");
		out.println("전화번호 : " + tel2 + "<br>");
		out.println("메모 : " + comment + "<br>");
		out.println("<h2>주문정보</h2><hr>");
		
		for(int i =0; i<fruit.length;i++) {				
			if(fruit[i].equals("과테말라 안티구아")) {
				 out.println("과테말라 안티구아 (100g) : " + fruit1 + "<br>");
			}
			if(fruit[i].equals("인도네시아 만델링")) {
				out.println("인도네시아 만델링 (100g) : " + fruit2 + "<br>");
			}
			if(fruit[i].equals("탐라는도다")) {
				 out.println("탐라는도다(블렌딩)(100g) : " + fruit3 + "<br>");
			}
			}
		
		 
		  
		 
		 
		
	}
}
