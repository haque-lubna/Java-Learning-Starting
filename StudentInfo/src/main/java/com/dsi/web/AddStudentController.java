package com.dsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsi.web.dao.StudentDao;
import com.dsi.web.model.Student;

/**
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		int regNo = Integer.parseInt(request.getParameter("reg"));
		String deptName = request.getParameter("dept");
		double cgpa = Double.parseDouble(request.getParameter("cg"));
		
		
		StudentDao std = new StudentDao();
		std.connect();
		try {
			std.add(firstName , lastName , regNo, deptName, cgpa);
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
		
		
		System.out.println("Student is added!");
		response.sendRedirect("index.jsp");
	}

}
