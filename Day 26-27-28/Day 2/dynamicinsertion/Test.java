package dynamicinsertion;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Test {
	public static void main(String args[])
	{
		
		Connection con = null;
		Statement smt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			int rollno=Integer.parseInt(args[0]);
			String nm = args[1];
			String addr= args[2];
			String sql = "insert into Student Values ("+rollno+",'"+nm+"','"+addr+"')";
			System.out.println(sql);
			smt=con.createStatement();
			smt.execute(sql);
			
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(smt!=null)
			{
				try {
					smt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
