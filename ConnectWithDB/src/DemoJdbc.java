import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(2);
		System.out.println(s1.sname);
		
		//add student
		Student s2 = new Student();
		s2.rollno = 3;
		s2.sname = "Niam";
		dao.connect();
		dao.addStudent(s2);
	}

}

class StudentDao{
	Connection con = null;
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/aliens" , "root" , "mysql");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Student getStudent(int rollno) {
		
		//fetch sname
		try {
			String query = "select sname from student2 where rollno="+rollno;
			Student s = new Student();
			s.rollno = rollno;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aliens" , "root" , "mysql");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.sname = name;
			return s;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
	}
	
	
	//add student
	public void addStudent(Student s2) {
		String query = "insert into student2 values (? , ?)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, s2.rollno);
			pst.setString(2, s2.sname);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

class Student{
	int rollno;
	String sname;
}
