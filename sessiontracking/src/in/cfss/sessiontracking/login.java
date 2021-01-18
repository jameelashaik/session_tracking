package in.cfss.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        out.print("welcome ADMIN successfully loggedin ");  
	        out.print("filter is invoked after");
	        out.close();  
	    }  
}
