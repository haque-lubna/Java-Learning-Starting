import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoClass2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
//		Pqr pqr = new Pqr();
		Class.forName("Pqr").newInstance();
		
		//load driver
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	}

}

class Pqr{
	static {
		System.out.println("in static!");
	}
	
	//instance
	{
		System.out.println("in instance");
	}
}
