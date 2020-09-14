package test;
import aaa.A;
import bbb.B;
import ccc.C;
import ddd.D;
import eee.E;

public class Test
{
public static void main(String args[])
{
A a1= new B();
a1.m1();
a1.m2();

B b1= new C();
b1.m1();
b1.m3();
b1.m4();

C c1=new D();
c1.m1();
c1.m4();

C c2=new E();
c2.m1();
c2.m4();

A a2 = new C();
a2.m1();
a2.m2();

A a3= new D();
a3.m1();
a3.m2();
}
}
