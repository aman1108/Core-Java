package preparedst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class Test {

		public static void main(String[] args) 
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
				String sql="insert into em values (?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, 5);
				ps.setString(2, "xyz");
/*				ps.setString(2, "KarveNagar");
*/				ps.execute();
			} 
			
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
