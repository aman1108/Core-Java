package cpable;

public class Student implements Comparable{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Object O)
	{
		Student stu = (Student)O;
		//return this.rollno-stu.rollno;
		return this.name.compareTo(stu.name);
	}
}
