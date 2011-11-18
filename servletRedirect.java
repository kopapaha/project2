import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;

public class servletRedirect extends HttpServlet {

  public void doPost(HttpServletRequest request,
                    HttpServletResponse response)
                    throws IOException {
	response.setContentType("text/html");	
	PrintWriter out = response.getWriter();
	Redirect link = (Redirect) getServletContext().getAttribute("redirect");

	//response.sendRedirect(getServletContext().getInitParameter("urlInitParam"));
	response.sendRedirect(link.getUrlRedirect());	

  }
}
