package cpator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Test {

	public static void main(String[] args) {
		Set<Student> s= null;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:To sort by RollNo");
		System.out.println("2:To sort by Name");
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				s=new TreeSet<>(new RollNoSort());
			break;
		case 2:
				s=new TreeSet<>(new NameSort());
			break;
		}
		
		Student stu1=new Student();
		stu1.setRollno(1);
		stu1.setName("abc");
		Student stu2=new Student();
		stu2.setRollno(2);
		stu2.setName("xyz");
		Student stu3=new Student();
		stu3.setRollno(3);
		stu3.setName("Abc");
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
