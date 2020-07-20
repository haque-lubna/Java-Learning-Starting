import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uName = "root";
		String pass = "mysql";
		
		int userid = 8;
		String username = "Koli";
//		String query = "insert into student values(" + userid + ",  '" + username + " ')";
		//forprepared statement
		String query = "insert into student values(? , ?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , uName, pass);
		
//		Statement st = con.createStatement(); // when we use static value
		
		
		//when need to use dynamic value
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, userid);
		pst.setString(2, username);
		
//		ResultSet rs = st.executeQuery(query);  //to fetch data. which returns a result set
//		String userData = "";
//		while(rs.next()) {
//			  userData = rs.getInt(1) + " : " + rs.getString(2);
//			  System.out.println(userData);
//		}
		
		
		int count = pst.executeUpdate();  //returns count . num of rows affected
		System.out.println(count + " row(s) are affected!" );
		pst.close();
		con.close();

	}

}
