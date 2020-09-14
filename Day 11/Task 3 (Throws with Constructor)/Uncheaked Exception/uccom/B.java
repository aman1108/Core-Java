package uccom;

public class B extends A {
	public B()
	{
		System.out.println("I am in");
	}

	public static void main(String[] args)
{
	try
	{
		B b = new B();
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Catch-Block");
	}
}

}
