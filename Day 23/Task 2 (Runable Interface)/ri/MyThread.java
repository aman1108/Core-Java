package ri;

public class MyThread implements Runnable{
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
