
public class D {
	public static void main(String args[])
	{
		try
	{
		System.out.println("try--block");
		int a = 10/2;
		System.out.println("try--end");
	}
		catch(ArithmeticException e)
		{
			System.out.println("Catch---block");
		}
	finally
	{
		System.out.println("finally----block");
	}
		System.out.println("Program-end");
	}
}
