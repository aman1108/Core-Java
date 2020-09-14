public class Test
{
public static void main(String args[])
{
A a=new A();
a.m1();
C c=new C();
c.m1();
c.m3();
B b =new B();
b.m1();
b.m2();
A a1=new B();
a1.m1();
A a2= new C();
a2.m1();
}
}