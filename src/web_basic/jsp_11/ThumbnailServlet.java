package web_basic.jsp_11;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/jsp_11/thumbnail")
public class ThumbnailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		String imagePath=context.getRealPath("jsp_11/images");
		
		System.out.println("imagePath " + imagePath);
		int size = 1*1024*1024 ;
		String filename="";
		
		try{
			MultipartRequest multi=	new MultipartRequest(request,
			  					  imagePath,
								  size,
								  "utf-8",
								new DefaultFileRenamePolicy());
			
			Enumeration<String> files=multi.getFileNames();
			
			String file =(String)files.nextElement();
			filename=multi.getFilesystemName(file);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		ParameterBlock pb=new ParameterBlock();
		pb.add(imagePath+"/"+filename);
		RenderedOp rOp=JAI.create("fileload",pb);
		
		BufferedImage bi= rOp.getAsBufferedImage();
		BufferedImage thumb=new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
		
		Graphics2D g=thumb.createGraphics();
		g.drawImage(bi,0,0,100,100,null);
		
		File file=new File(imagePath+"/sm_"+filename);
		ImageIO.write(thumb,"jpg",file);
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.printf("<img src='images/%s'><br>", filename);
		out.printf("<img src='images/sm_%s'>", filename);
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
