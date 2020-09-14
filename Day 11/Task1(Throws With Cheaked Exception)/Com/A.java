package Com;

public class A {
	public void m1() throws ClassNotFoundException
	{
		System.out.println("m1----------Start");
		Class.forName("");
		System.out.println("m1-------End");
	}
	public static void main(String[] args)
	{
		System.out.println("main---------Start");
		A a = new A();
		try
		{
			a.m1();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Catch-----Block");
		}
		System.out.println("main-----End");
	}
}
