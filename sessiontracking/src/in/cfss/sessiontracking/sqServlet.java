	package in.cfss.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
//		HttpSession session=req.getSession();
//		int k=(Integer) session.getAttribute("k");
		    resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
		//	int k = 0;
//			Cookie ck[] = req.getCookies();
//			for (Cookie coo : ck) {
//				if (coo.getName().equals("k")) {
//					k = Integer.parseInt(coo.getValue());
//				}
//			}
			int k = (Integer) req.getAttribute("k");
			k = k*k;

		out.println("result: "+ k);
		out.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("sq checking..");
		}

	}

}
