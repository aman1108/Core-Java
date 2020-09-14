package superthisinmeth;

public class B extends A{

	public void m1()
	{
		System.out.println("m1------B");
		super.m1();
	}
	
	public void m2()
	{
		super.m1();
		this.m1();
	}
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}

}
