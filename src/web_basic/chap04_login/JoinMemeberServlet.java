package web_basic.chap04_login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04_login/JoinMemeberServlet")
public class JoinMemeberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
       
        String name = request.getParameter("name");
        String userId = request.getParameter("userId");
        String nickName = request.getParameter("nickName");
        String pwd = request.getParameter("pwd");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        
        Member member = new Member(name, userId, nickName, pwd, email, phone);
        
        if (userId.equals("test")) {
        	request.setAttribute("member", member);
        	request.getRequestDispatcher("addMemberServlet.jsp").forward(request, response);
        }else {
        	response.sendRedirect(request.getContextPath() +"/chap01/first.html");
        }
        
    }

}
