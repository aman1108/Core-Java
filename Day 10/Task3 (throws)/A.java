
public class A {
	public void m1()
	{
		B b= new B();
		try
		{
			b.m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch------Block");
		}
		System.out.println("m1-----end");
	}
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		System.out.println("main------end");
	}
}
