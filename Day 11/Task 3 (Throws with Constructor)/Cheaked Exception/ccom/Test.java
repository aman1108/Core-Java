package ccom;

public class Test {
	public static void main(String args[])
	{
		try
		{
		B b= new B();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Catch------Block");
		}
	}

}
