package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");		
		
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		
		String subject = request.getParameter("subject");
		String[] gubun = request.getParameterValues("gubun");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.printf("아이디 %s<br>비밀번호%s </br>", id, pw);
		out.println("<h2>수강과목</h2>");
		String t = null;
		if(subject.equals("eng")) {
			t="영어회화";
		}else if(subject.equals("ch")) {
			t="중국어회화";
		}else {
			t="일어회화";
		}		
		out.println("subject = " + t+"<br>");
						
		/*
		 * out.println("<h2>수강분야</h2>"); String[] t1 = {"문법","작문","독해"}; String[] t2 =
		 * null; if(gubun.equals("grm")) { t2. }
		 */
			
		for(int i =0; i<gubun.length;i++) {
			out.println("<td>");
			out.println("분야 = "+gubun[i]);
			out.println("<br>");
			out.println("</td>");
			}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
