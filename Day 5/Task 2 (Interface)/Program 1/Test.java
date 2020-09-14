public class Test
{
public static void main(String args[])
{
Connection con= new MySql();
con.commit();
con.rollno();
Connection con1= new Oracle();
con1.commit();
con1.rollno();
}
}