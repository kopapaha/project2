import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;

public class proj1Post extends HttpServlet {

    public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
                    throws IOException {
            PrintWriter out = response.getWriter();
            java.util.Date today = new java.util.Date();
		//String s = request.getParameter("fname");
            out.println("<html> " +
                        "<body>" +
                        "<h1 align=center> Converter </h1>"
                        + "<br>" + today + " NEW " + "</body>" + "</html>");
    }
    public void doPost(HttpServletRequest request,
                    HttpServletResponse response)
                    throws IOException {
            PrintWriter out = response.getWriter();
            java.util.Date today = new java.util.Date();
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String fromVal = request.getParameter("fromVal");


/////correct http://www.google.com/ig/calculator?hl=en&q=100EUR=?USD

		String urlStr = "http://www.google.com/ig/calculator?hl=en&q=" + fromVal + from  +"=?" + to;
			URL convert = new URL(urlStr);
			BufferedReader in = new BufferedReader(new InputStreamReader(convert.openStream()));
			String answer = in.readLine();
			in.close();
String[] temp;
/* delimiter */
String delimiter = "\"";
/* given string will be split by the argument delimiter provided. */
temp = answer.split(delimiter);
/* print substrings */
//for(int i =0; i < temp.length ; i++)
//System.out.println(temp[i]);


            out.println("<html> " +
                        "<body>" +
                        "<h1 align=center> Converter </h1>"
                        + "<br>" + today + "<p>" + " from " + from + " to " + to + " amount " + fromVal + "<p>" +  " with GOOGLE's help: " + temp[1] + " equals to  " + temp[3] + "</body>" + "</html>");


    }
}
