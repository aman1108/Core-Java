package ctmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/test","root","root");
		String sql_query = "insert into student values(2,'abc','Akurdi')";
		Statement smt = con.createStatement();
		smt.execute(sql_query);
		smt.close();
		con.close();
	}

}
