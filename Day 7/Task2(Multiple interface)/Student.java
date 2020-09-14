
public class Student implements A,B  {
	
	public void display()
	{
		System.out.println("I am in");
	}
	
	public static void main(String[] args)
	{
		Student s= new Student();
		s.display();
	}
	

}
