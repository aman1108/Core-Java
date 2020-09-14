
public class Test {
	public static void main(String args[])
	{
		System.out.println("Main--------");
		try
		{
			System.out.println("try-----start");
			int a=10/0;
			System.out.println("try-----end");
		}
		catch(Exception e)
		{
			System.out.println("Catch-----block");
		}
		System.out.println("Main-----End");
	}

}
