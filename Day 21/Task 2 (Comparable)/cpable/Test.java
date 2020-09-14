package cpable;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String args[])
	{
		Student stu1=new Student();
		stu1.setRollno(1);
		stu1.setName("abc");
		Student stu2=new Student();
		stu2.setRollno(2);
		stu2.setName("xyz");
		Student stu3=new Student();
		stu3.setRollno(3);
		stu3.setName("Abc");
		Set<Student> s= new TreeSet<>();
		s.add(stu3);
		s.add(stu2);
		s.add(stu1);
		
		for(Student stu: s)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	}

}
