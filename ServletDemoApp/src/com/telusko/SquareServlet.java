package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
//		int sum = (int) req.getAttribute("sum");
//		int ans = sum*sum;
//		PrintWriter print = res.getWriter();
//		print.println("the square value is : " + ans);
		
		//for redirecting
//		System.out.println("Hello using redirect");
//		int sum = Integer.parseInt(req.getParameter("sum"));
//		int ans = sum*sum;
//		PrintWriter print = res.getWriter();
//		print.println("the square value is : " + ans);
		
		//using htthp session
//		HttpSession session = req.getSession();
//		session.removeAttribute("sum");// for remove a session value
//		int sum = (int) session.getAttribute("sum");
//		sum = sum*sum;
//		PrintWriter print = res.getWriter();
//		print.println("the square value is : " + sum);
		
		//using cookie
		int sum = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		sum = sum*sum;
		PrintWriter print = res.getWriter();
		
		//print html tag
//		print.println("<html><body bgcolor='cyan'>");
		print.println("result is: " + sum);
//		print.println("</body></html>");
	}

}
