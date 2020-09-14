package cll;

public class Hello {
	
	synchronized static public void display(String msg)
	{
		for (int i=0;i<10;i++)
		{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		}
	}

}
