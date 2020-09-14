package cll;

public class MyThread extends Thread {
	
	Hello h;
	String msg;
	
	public MyThread(Hello h, String msg)
	{
		this.h=h;
		this.msg=msg;
	}
	
	public void run()
	{
		h.display(msg);
	}
}
