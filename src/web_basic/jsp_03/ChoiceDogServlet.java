package web_basic.jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_03/ChoiceDog")
public class ChoiceDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String[] dog = request.getParameterValues("dog");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor = 'black'>");
		out.println("<table align = 'conter' bgcolor='yellow'>");
		out.println("<tr>");
		for(int i =0; i<dog.length;i++) {
			out.println("<td>");
			out.println("<img src='images/"+dog[i]+"'/>");
			out.println("</td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	String[] dog = request.getParameterValues("dog");
	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body bgcolor = 'black'>");
	out.println("<table align = 'conter' bgcolor='yellow'>");
	out.println("<tr>");
	for(int i =0; i<dog.length;i++) {
		out.println("<td>");
		out.println("<imgsrc='images/"+dog[i]+"'/>");
		out.println("</td>");
	}
	out.println("</tr>");
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");
	
	
	}

}
