package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String rpw = request.getParameter("rpw");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
		String homep = request.getParameter("homep");
		
		String num = request.getParameter("num");
		
		String member = request.getParameter("member");
		String stuffs = request.getParameter("stuffs");
		String satis = request.getParameter("satis");
		
		String subject = request.getParameter("subject");
		
		String[] mailing = request.getParameterValues("mailing");
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		
		out.println("<html>");
		out.println("<h2>가입정보</h2>");
		out.println("아이디 = " + id +"<br>");
		if(pw == rpw ) {
			out.println("비밀번호 : 일치"+"<br>");
		}else {
			out.println("비밀번호 : 불일치"+"<br>");
		}
		out.println("이름 = " + name +"<br>");
		out.println("메일주소 = " + mail +"<br>");
		out.println("연락처 = " + phone +"<br>");
		out.println("홈페이지  = " + homep +"<br>");
		
		out.println(" 개수 = " + num +"<br>");
		out.println(" 참여인원 = " + member +"<br>");
		out.println(" 지원물품 = " + stuffs +"<br>");
		out.println(" 희망단계 = " + satis +"<br>");
		String t = null;
		if(subject.equals("speaking")) {
			t="회화";
		}else if(subject.equals("grammar")) {
			t="문법";
		}else {
			t="작문";
		}
		out.println("신청과목= " + t +"<br>");
		out.println("메일링 = ");
		for(int i =0; i<mailing.length;i++) {
			if(mailing[i].equals("news")) {
				out.println("해외 단신");
			}
			if(mailing[i].equals("dialog")) {
				out.println("5분 회화");
			}
			if(mailing[i].equals("pops")) {
				out.println("모닝팝스");
			}
			}
		out.println("<br>");
		out.println(" star = " + satis +"<br>");	
		out.println(" end = " + satis +"<br>");	
		out.println(" start Time = " + start +"<br>");	
		out.println(" end  Time = " + end +"<br>");	
			
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

}
