package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String query = "select * from user_login where user_name=? and password=?";
	String url = "jdbc:mysql://localhost:3306/aliens";
	String username = "root";
	String password = "mysql";
	
	
	
	public boolean check_users(String uname , String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, uname);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			
		} catch (Exception e) {
			System.out.println("exception : "+e);
		}
		return false;
	}
}
