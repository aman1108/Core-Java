package cpator;

import java.util.Comparator;

public class NameSort implements Comparator<Student> {

	public int compare(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}
}
