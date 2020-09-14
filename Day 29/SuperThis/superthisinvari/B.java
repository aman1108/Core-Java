package superthisinvari;

public class B extends A {

	int a=20;
	public void m1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
