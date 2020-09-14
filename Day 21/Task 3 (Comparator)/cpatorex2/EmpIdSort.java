package cpatorex2;

import java.util.Comparator;

public class EmpIdSort implements Comparator<Employee>{
	
	public int compare(Employee stu1,Employee stu2) {
		
		return stu1.getEmpid()-stu2.getEmpid();
	}
}
