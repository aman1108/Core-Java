package cec;

public class Test {

	public void m1(int age) throws AgeInvalidException
	{
		System.out.println("m1----start");
		if (age<0)
		{
			AgeInvalidException e = new AgeInvalidException("Age--");
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
		catch(AgeInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}
}
