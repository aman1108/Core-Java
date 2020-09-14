
public class A {
	protected void m1() throws ArithmeticException
	{
		System.out.println("A--------m1---------Start");
		int a=10/0;
		System.out.println("A--------m1---------End");
	}
	public void m2()
	{
		System.out.println("A--------m2---------Start");
		int b=10/0;
		System.out.println("A--------m2---------End");
	}
}
