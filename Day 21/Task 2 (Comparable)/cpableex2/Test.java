package cpableex2;

import java.util.Set;
import java.util.TreeSet;


public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Abc");
		emp1.setSalary(5000);
		Employee emp2 = new Employee();
		emp2.setName("ABC");
		emp2.setSalary(7000);
		Employee emp3 = new Employee();
		emp3.setName("ABC");
		emp3.setSalary(70000);
		Set<Employee> s= new TreeSet<>();
		s.add(emp1);
		s.add(emp2);
		s.add(emp3);
		
		for(Employee emp: s)
		{
			System.out.println(emp.getSalary());
			System.out.println(emp.getName());
		}

	}

}
