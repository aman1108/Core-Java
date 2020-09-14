package pcon;

public class Common {

	private static int value;
	private boolean flag= true;
	public synchronized void produce(int i)
	{
	if (flag==true)
	{
		value=i;
		System.out.println("Producer----PProduce-----"+value);
		flag=false;
		notify();
	}
	else
	{
		try
		{
			wait();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	}
	public synchronized int consume()
	{
		if (flag)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
		}
		flag=true;
		notify();
		return value;
	}
}
