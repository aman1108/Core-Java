class Test
{
public static void main(String args[])
{
Student s1= new Student();
s1.setRollno(1);
s1.setName("A");
Address a= new Address();
s1.setaddress(a);
s1.getaddress().setArea("Karve");
a.setCity("Pune");
System.out.println(s1.getRollno());
System.out.println(s1.getName());
System.out.println(s1.getaddress().getArea());
System.out.println(s1.getaddress().getCity());
}
}