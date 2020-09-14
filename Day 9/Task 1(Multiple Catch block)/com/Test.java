package com;

public class Test {
	public static void main(String args[])
	{
		try
		{
			String s= args[0];
			int a= Integer.parseInt(s);
			int x=10/a;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Plz enter Number");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Enter non Zero value");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Enter Numeric Value");
		}
	}
}
