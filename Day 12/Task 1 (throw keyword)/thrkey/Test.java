package thrkey;

public class Test {

		public void m1(int age)
		{
			System.out.println("m1----start");
			if (age<0)
			{
				ArithmeticException e = new ArithmeticException("Age-----Problem");
				throw e;
			}
			System.out.println("m1----End");
		}
		
		public static void main(String args[])
		{
			Test t =new Test();
			try
			{
				t.m1(-5);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Main End");
		}
}
