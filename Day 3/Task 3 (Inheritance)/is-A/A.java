public class A
{
public static void main(String args[])
{
B b =new B();
B a = new C();
C c= new C();
b.m1();
a.m1();
c.m1();
c.m2();
}
}

class B
{
void m1()
{
System.out.println("I am in B");
}
}

class C extends B
{
void m2()
{
System.out.println("I am in C");
}
}

