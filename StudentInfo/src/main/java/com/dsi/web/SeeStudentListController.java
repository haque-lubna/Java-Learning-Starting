package com.dsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsi.web.dao.StudentDao;
import com.dsi.web.model.Student;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class AddStudentController
 */

public class SeeStudentListController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("student list");
		StudentDao std = new StudentDao();
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		try {
			std.connect();
			studentList = std.see();
			for(Student st : studentList) {
				out.println(st.toString());
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
	}

}
