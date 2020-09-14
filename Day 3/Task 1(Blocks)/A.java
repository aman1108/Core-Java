public class A
{
public A()
{
System.out.println("I am in Constructor");
}
static 
{
System.out.println("I am in Static Block of A");
}

{
System.out.println("I am in Non Static Block");
}

public static void main(String args[])
{
System.out.println("I am in main");
}

}

class B
{
static {
System.out.println("I am in Static Block of B");
}
public static void main(String args[])
{
A a = new A();
}
}
