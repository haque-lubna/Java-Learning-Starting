package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class AlienIdFilter
 */
@WebFilter("/addAlien")
public class AlienIdFilter implements Filter {
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(req.getParameter("aid"));
		String name = req.getParameter("aname");
		if(aid >= 0) {
			if(name.length() >= 3) {
				chain.doFilter(request, response);
			}
			else
				out.println("The name is too short");
		}
		else
			out.println("Invalid id");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
