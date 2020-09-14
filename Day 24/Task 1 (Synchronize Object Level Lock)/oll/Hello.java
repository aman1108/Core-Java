package oll;

public class Hello {
	
	synchronized public void display(String msg)
	{
		for (int i=0;i<10;i++)
		{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		}
	}

}
