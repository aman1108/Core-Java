package cpatorex2;

import java.util.Comparator;

public class NameSort implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee stu1=(Employee)o1;
		Employee stu2=(Employee)o2;
		return stu1.getName().compareTo(stu2.getName());
}
}
