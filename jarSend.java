import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;

public class jarSend extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
                    throws IOException {
	response.setContentType("application/jar");	
	
	ServletContext ctx = getServletContext();
	InputStream is = ctx.getResourceAsStream("/files.jar");

	int read =0;
	byte[] bytes = new byte[1024];

	OutputStream os = response.getOutputStream();
	while((read = is.read(bytes))!=-1){
		os.write(bytes,0,read);
	}
	os.flush();
	os.close();



  }
}
