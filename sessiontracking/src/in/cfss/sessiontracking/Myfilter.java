package in.cfss.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Myfilter implements Filter  {
	@Override
	public void init(FilterConfig arg0) throws ServletException {

		
	}
	 
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {
	    PrintWriter out=res.getWriter();  
	    out.print("filter is invoked before");  
	    String password = req.getParameter("password");
	    if("password".equals(password)){
	    	chain.doFilter(req, res);//sends request to next resource  
	    	  
	    }else{
	    	out.print("username or password error!");  
	        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
	        rd.forward(req, res);

	
	    }      
	    out.print("filter is invoked after");
	          
	    
		
	}
	
	public void destroy() {

		
	}
}
