package web_basic.jsp_10;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/jsp_10/fileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/hteml;charset=utf-8");

		PrintWriter out = response.getWriter();
		
		//여기를 바꿔주면 다운받는 경로가 바뀜
		String savePath="/upload";
		//최대 업로드 파일크기 10MB로 제한
		int uploadFileSizeLimit = 10*1024*1024;		
		String encTyp = "UTF-8";
		
		ServletContext context = getServletContext();
		
		String uploadPath = request.getRealPath("/upload");

		int size =10*1024*1024;
		String name = "";
		String subject = "";
		String filename1 = "";
		String filename2 = "";
		String origfilename1 = "";
		String origfilename2 = "";
		
		try{
			MultipartRequest multi	= new MultipartRequest(
					request,
					uploadPath,
					size,
					"UTF-8",
					new DefaultFileRenamePolicy());
			
			name = multi.getParameter("name");
			subject= multi.getParameter("subject");
			
			Enumeration files= multi.getFileNames();
			
			String file1 = (String)files.nextElement();
			filename1 = multi.getFilesystemName(file1);
			origfilename1 = multi.getOriginalFileName(file1);
			
			String file2= (String)files.nextElement();
			filename2 = multi.getFilesystemName(file2);
			origfilename2 = multi.getOriginalFileName(file2);
			
			request.setAttribute("name", name);
			request.setAttribute("subject", subject);
			request.setAttribute("filename1", filename1);
			request.setAttribute("filename2", filename2);
			request.setAttribute("origfilename1", origfilename1);
			request.setAttribute("origfilename2", origfilename2);			
			
		}catch(Exception e){
			System.out.println("예외 발생 : " + e);
		}	

		request.getRequestDispatcher("fileuploadCheck.jsp").forward(request, response);
	
	}
}
