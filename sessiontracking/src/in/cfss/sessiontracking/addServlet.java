package in.cfss.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
		      resp.setContentType("text/html"); 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
//			HttpSession session=req.getSession();
//			session.setAttribute("k", k);
//		resp.sendRedirect("sq");
//	    Cookie ck=new Cookie("k",k+"");//creating cookie object  
//	    resp.addCookie(ck);//adding cookie in the response  
		        PrintWriter out = resp.getWriter();
		        req.setAttribute("k",k);
		        RequestDispatcher rd = req.getRequestDispatcher("sq");
		        rd.forward(req, resp);
		
			out.close(); 
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("add checking..");
		}
	}
}
