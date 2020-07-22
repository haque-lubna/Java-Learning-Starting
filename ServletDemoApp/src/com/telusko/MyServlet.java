package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		//using servlet context
//		ServletContext context = getServletContext();
//		String name = context.getInitParameter("phone");
//		out.println(name);
		
		//using servlet config(initial)
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		out.println(name);
	}

}
