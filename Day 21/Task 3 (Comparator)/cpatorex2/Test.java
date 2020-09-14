package cpatorex2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Employee> s= null;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:To sort by Employee Id");
		System.out.println("2:To sort by Name");
		System.out.println("3:To sort by Salary");
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			s=new TreeSet<>(new EmpIdSort());
			break;
		case 2:
			s=new TreeSet<>(new NameSort());
			break;
		case 3:
			s= new TreeSet<>(new SalSort());
			break;
		}
		
		Employee emp1 = new Employee();
		emp1.setName("Abc");
		emp1.setSalary(5000);
		emp1.setEmpid(1);
		Employee emp2 = new Employee();
		emp2.setName("ABC");
		emp2.setSalary(7000);
		emp2.setEmpid(2);
		Employee emp3 = new Employee();
		emp3.setName("AbC");
		emp3.setSalary(70000);
		emp3.setEmpid(3);
		s.add(emp1);
		s.add(emp2);
		s.add(emp3);
		
		for(Employee emp: s)
		{
			System.out.println(emp.getEmpid());
			System.out.println(emp.getSalary());
			System.out.println(emp.getName());
		}

	}

}
