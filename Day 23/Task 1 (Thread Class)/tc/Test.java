package tc;

public class Test {
	public static void main(String args[])
	{
		NumberG odd= new NumberG(1,100);
		NumberG even= new NumberG(2,100);
		odd.start();
		even.start();
	}
}
