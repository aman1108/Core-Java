package ri;

public class Test {
	public static void main(String args[])
	{
		MyThread mt= new MyThread();
		Thread t= new Thread(mt);
		t.start();
		t.setName("thrrread");
		for(int i=1;i<100;i++)
		{
			System.out.println("main");
		}
	}

}
