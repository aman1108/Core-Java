
public class Test {
	
	public static void main(String args[])
	{
		A b = new B();
		A a = new A();
		try
		{
			System.out.println("Try-------Start");
			a.m2();
			System.out.println("Try-------End");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Catch-----Block");
		}
	}

}
