package cll;

public class Test {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		MyThread t1 = new MyThread(h1,"Java");
		MyThread t2 = new MyThread(h1,"CJC");
		t1.start();
		t2.start();
		Hello h2 = new Hello();
		MyThread t3 = new MyThread(h2,"Karve Nagar");
		MyThread t4 = new MyThread(h2,"Pune");
		t3.start();
		t4.start();
	}
}
