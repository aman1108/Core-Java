package com;

public class Test1 {
	public int m1()
	{
		int x=30;
		try
		{
			System.out.println("Try-----Start");
			int a=10/0;
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
			Test1 t= new Test1();
			int x= t.m1();
			System.out.println(x);
			System.out.println("Main-------end");
		}

}
