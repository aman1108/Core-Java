package pcon;

public class Consumer extends Thread{
	Common c;
	public Consumer(Common c)
	{
		this.c=c;
	}
	public void run()
	{
		int i=0;
		while (true)
		{
			int data=c.consume();
			System.out.println();
			System.out.println("Consumer------Consume-"+data);
			try {
				sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
