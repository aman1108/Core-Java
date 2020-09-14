package com;

public class Test {

	public static void main(String args[])
	{
		A b = new A();
		try
		{
		System.out.println("try-------start");
		b.m1();
		System.out.println("try--------End");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Catch-------Block");
		}
	}
}
