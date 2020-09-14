package com;

public class A {

	protected void m1() throws ClassNotFoundException
	{
		System.out.println("A--------m1---------Start");
		Class.forName(" ");
		System.out.println("A--------m1---------End");
	}
}

