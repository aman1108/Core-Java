package superthisinconstru;

public class B extends A {
	
	public B()
	{
		this(5);
		System.out.println("Constructor----B");
	}
	
	public B(int x)
	{
		this("abc");
		System.out.println("Constructor----B--------int");
	}

	public B(String y)
	{
		System.out.println("Constructor----B--------String");
	}
	

	public static void main(String[] args) {
		
		B b= new B();
	}

}
