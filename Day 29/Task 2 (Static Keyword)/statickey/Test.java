package statickey;

public class Test {
	public static void main(String[] args) {
	
		A a= new A();
		a.y=200;
		a.x=100;
		
		A a1 = new A();
		a1.y=500;
		a1.x=50;
		
		A a2 = new A();
		a2.x=10;
		a2.y=10;
		
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a2.x);
		System.out.println(a2.y);
	}
}
