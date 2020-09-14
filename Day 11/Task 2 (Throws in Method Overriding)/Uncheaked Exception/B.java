
public class B extends A{

	public void m1()
	{
		System.out.println("B--------m1---------Start");
		int c=10/0;
		System.out.println("B--------m1---------End");
	}
	public void m2() throws ArithmeticException
	{
		System.out.println("B--------m2---------Start");
		int d=10/0;
		System.out.println("B--------m2---------End");
	}
}
