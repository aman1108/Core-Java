package sdp;

public class A {
	private A()
	{
		
	}
	private static A a;
	public static A m1()
	{
		if (a==null)
		{
			a=new A();
		}
			
		return a;
	}

}
