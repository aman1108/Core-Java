package cpableex2;

public class Employee implements Comparable{
	private int salary;
	private String name;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Object O)
	{
		
		Employee emp = (Employee)O;
		System.out.println(emp.getSalary());
	int i	= this.salary-emp.salary;
System.out.println(i);
return i;
	}

}
