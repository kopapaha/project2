//package p2;
import javax.servlet.*;



public class contextListener implements ServletContextListener{


  public void contextInitialized(ServletContextEvent event){
	ServletContext sc = event.getServletContext();
	String urlRedirect = sc.getInitParameter("urlInitParam");

	Redirect r = new Redirect(urlRedirect);
	sc.setAttribute("redirect", r);


  }


  public void contextDestroyed(ServletContextEvent event){
	//empty
  }


}

