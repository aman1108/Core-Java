package test;
import emp.Employee;
import add.Address;
class Test
{
public static void main(String args[])
{
Employee s1= new Employee();

s1.setRollno(1);
s1.setName("A");

Address a1= new Address();

s1.setperaddress(a1);
s1.getperaddress().setArea("Karve");
a1.setCity("Pune");
System.out.println(s1.getEmpid());
System.out.println(s1.getEmpName());
System.out.println(s1.getperaddress().getArea());
System.out.println(s1.getperaddress().getCity());

Address a2= new Address();

s1.setlocaddress(a2);
s1.getlocaddress().setArea("Kothrud");
a2.setCity("Pune");
System.out.println(s1.getlocaddress().getArea());
System.out.println(s1.getlocaddress().getCity());
}
}