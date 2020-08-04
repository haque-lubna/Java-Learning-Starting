package com.dsi.web.dao;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import com.dsi.web.model.Student;


public class StudentDao {
	Connection con = null;
	public void connect() {
		String url = "jdbc:mysql://localhost:3306/aliens";
		String username = "root";
		String password = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("Mysql Exception: " + e);
		}
	}
	
	public void add(String firstName , String lastName , int regNo, String deptName, double cgpa) throws SQLException {
		String query = "insert into student_info values (?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setString(1, firstName);
		pst.setString(2, lastName);
		pst.setInt(3, regNo);
		pst.setString(4, deptName);
		pst.setDouble(5, cgpa);
		
		int count = pst.executeUpdate();
		System.out.println(count + " row(s) are affected!");
		
		pst.close();
		con.close();
		System.out.println("visit add dao");
	}
	public ArrayList<Student> see(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		
		String query = "select * from student_info";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int colum = rsmd.getColumnCount();
//			System.out.println(colum);
			
			if(rs.next()) {
				do {
					String firstName = rs.getString(1);
					String lastName = rs.getString(2);
					int regNo = rs.getInt(3);
					String deptName = rs.getString(4);
					double cgpa = rs.getDouble(5);
					Student student = new Student();
					student.setFirstName(firstName);
					student.setLastname(lastName);
					student.setRegNo(regNo);
					student.setDeptName(deptName);
					student.setCgpa(cgpa);
					list.add(student);
				} while(rs.next());
			}
			pst.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
		return list;
	}

}
