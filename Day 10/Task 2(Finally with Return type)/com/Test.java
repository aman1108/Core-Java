package com;

public class Test {
	public int m1()
	{
		int x=30;
		try
		{
			System.out.println("Try-----Start");
			return x;
		}
		finally
		{
			x=10;
			System.out.println("Finally-----Block");
			return x;
		}
	}
		public static void main(String[] args)
		{
			Test t= new Test();
			int x= t.m1();
			System.out.println(x);
		}

}
