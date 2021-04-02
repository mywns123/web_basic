package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/selectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String num = request.getParameter("num"); 
		String name = request.getParameter("name"); 
		String class1 = request.getParameter("class1"); 
		String interest = request.getParameter("interest");
		String add = request.getParameter("add");		
		String subadd =add.replace("\r\n", "<br>");
		
		String t=null;
		if(class1.equals("archi")) {
			t="건축공학과";
		}else if(class1.equals("mechanic")) {
			t="기계공학과";
		}else if(class1.equals("indust")) {
			t="산업공학과";
		}else if(class1.equals("elec")) {
			t="전기전자공학과";
		}else if(class1.equals("computer")) {
			t="컴퓨터공학과";
		}else if(class1.equals("chemical")) {
			t="화학공학과";
		}else if(class1.equals("history")) {
			t="사학과";
		}else if(class1.equals("lang")) {
			t="어문학부";
		}else if(class1.equals("philo")) {
			t="철학";
		}
		
		out.println("<h2>수강신청</h2>");
		out.println("학번 : " + num + "<br>");
		out.println("이름 : " + name + "<br>");		
		out.println("학과 : " + t + "<br>");
		out.println("관심분야 : " + interest + "<br>");
		out.println("추가사항 : " + add + "<br>");
		out.printf("%s <br>",subadd);
		
	}

}
