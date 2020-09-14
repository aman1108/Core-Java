
public class A {
public static void main(String args[])
{
	try
{
	System.out.println("try--block");
	int a = 10/0;
	System.out.println("try--end");
}
finally
{
	System.out.println("finally----block");
}
	System.out.println("Program-end");
}
}