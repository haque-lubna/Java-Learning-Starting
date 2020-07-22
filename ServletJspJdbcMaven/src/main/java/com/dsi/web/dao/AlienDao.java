package com.dsi.web.dao;

import java.sql.*;
import com.dsi.web.model.Alien;

public class AlienDao {
	public Alien getAlien(int aid) {
		Alien a = new Alien();
//		a.setAid(101);
//		a.setAname("Lubna");
//		a.setTech("java");
		String url = "jdbc:mysql://localhost:3306/aliens";
		String usertname = "root";
		String password = "mysql";
		String query = "select * from alien_info where aid=?";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  //for load driver
			Connection con = DriverManager.getConnection(url , usertname, password);  //create connection
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, aid);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int id = rs.getInt(1);
				String aname = rs.getString(2);
				String atech = rs.getString(3);
				
				a.setAid(id);
				a.setAname(aname);
				a.setTech(atech);
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		return a;
	}
}
