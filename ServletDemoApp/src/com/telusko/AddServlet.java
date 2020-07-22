package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet extends HttpServlet{  //extends HttpServlet
	
	//need two parameters request and response
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		//fetch two values from users using the input name
		//getParameter returns string so need to type caste
		//so use Integer.parseInt()
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		int sum = a + b;
		
//		System.out.println("The Result is : " + sum);  //shows in console
		
		//to show in server
//		PrintWriter print = res.getWriter();
//		print.println("The result is : " + sum);
		
		//call a servlet from a servlet using request dipatcher
//		req.setAttribute("sum", sum);  //send sum value 
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
		
		//call a servlet from a servlet using redirect
//		res.sendRedirect("square"); //without sending data
//		res.sendRedirect("square?sum=" + sum);   //url rewriting
		
		//send data using httpSession
//		HttpSession session = req.getSession();
//		session.setAttribute("sum", sum);
//		res.sendRedirect("square");
		
		//using cookie
//		Cookie cookie = new Cookie("sum" , sum + "");
//		res.addCookie(cookie);
//		res.sendRedirect("square");
	}
}
