package Test;
public class test
{
public static void main(String args[])
{
C c = new C();
c.b.a.m1();
c.b.m1();
c.m2();
}
}
class A
{
void m1()
{
System.out.println("I am in A");
}
}

class B
{
A a = new A();
void m1()
{
System.out.println("I am in B");
}
}

class C
{
B b = new B();
void m2()
{
System.out.println("I am in C");
}
}
