
public class Test {
	public static void main(String args[])
	{
		
		System.out.println("Main--------");
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-----block");
		}
		System.out.println("Main-----End");
	}
}
