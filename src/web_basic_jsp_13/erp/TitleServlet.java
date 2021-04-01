package web_basic_jsp_13.erp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TitleServlet")
public class TitleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;
 
    public TitleServlet() {   
    	service = new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
			
		List<Title> lists = service.showTitles();
		System.out.println(lists);
		
		request.setAttribute("list", lists);
		request.getRequestDispatcher("jsp_13/titlelist.jsp").forward(request, response);
		
		/*
		 * PrintWriter out = response.getWriter(); out.print("<br>"); for(Title t:
		 * lists) { out.printf("%s - %s<br>", t.gettNo(), t.gettName()); }
		 */
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
