package com.cjc.services;
import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import com.cjc.model.*;

public class Operation implements ServicesI {
	
	List courseList = new ArrayList();
	List facultyList= new ArrayList();
	List batchList = new ArrayList();
	List studentList= new ArrayList();

	Scanner sc = new Scanner(System.in);
	
	public void addCourse()
	{
		Course c = new Course();
		System.out.println("Enter Course Id:");
		int cid = sc.nextInt();
		c.setCid(cid);
		System.out.println("Enter Course Name:");
		String cname = sc.next();
		c.setCname(cname);
		courseList.add(c);
	}
	
	public void viewCourse()
	{
		System.out.println("cid \t course");
		Iterator citr = courseList.iterator();
		while (citr.hasNext())
		{
			Course c1 = (Course) citr.next();
			System.out.println(c1.getCid() + "\t" + c1.getCname());
		}
	}

	public void addFaculty()
	{
		int flag=0;
		Faculty f = new Faculty();
		System.out.println("Enter Faculty Id:");
		int fid = sc.nextInt();
		f.setFid(fid);
		System.out.println("Enter Faculty Name:");
		String fname = sc.next();
		f.setFname(fname);
		System.out.println("Enter Course Id:");
		int fcid = sc.nextInt();
		Iterator citr1 = courseList.iterator();
		while (citr1.hasNext())
		{
			Course c2 = (Course) citr1.next();
			if (c2.getCid()==fcid)
			{
				flag=1;
				f.setCourse(c2.getCname());
			}
		}
		if (flag==0)
		{
			System.out.println("Invalid Course Id !");
		}
		facultyList.add(f);
	}
	
	public void viewFaculty()
	{
		System.out.println("fid \t fname \t Course");
		Iterator fitr = facultyList.iterator();
		while (fitr.hasNext())
		{
			Faculty f1 = (Faculty) fitr.next();
			System.out.println(f1.getFid() + "\t" + f1.getFname()+ "\t" + f1.getCourse());
		}
	}
	
	public void addBatch()
	{
		int flag=0;
		Batch b = new Batch();
		System.out.println("Enter Batch Id:");
		int bid = sc.nextInt();
		b.setBid(bid);
		System.out.println("Enter Batch Name:");
		String bname = sc.next();
		b.setBname(bname);
		System.out.println("Enter Faculty Id:");
		int bfid = sc.nextInt();
		Iterator fitr1 = facultyList.iterator();
		while (fitr1.hasNext())
		{
			Faculty f2 = (Faculty) fitr1.next();
			if (f2.getFid()==bfid)
			{
				flag=1;
				b.setFaculty(f2.getFname());
			}
		}
		if (flag==0)
		{
			System.out.println("Invalid Faculty Id !");
		}
		batchList.add(b);
	}
	
	public void viewBatch()
	{
		System.out.println("Bid \t Bname \t Faculty");
		Iterator bitr = batchList.iterator();
		while (bitr.hasNext())
		{
			Batch b1 = (Batch) bitr.next();
			System.out.println(b1.getBid() + "\t" + b1.getBname()+ "\t" + b1.getFaculty());
		}
	}
	
	public void addStudent()
	{
		int flag=0;
		Student s = new Student();
		System.out.println("Enter Student Id:");
		int sid = sc.nextInt();
		s.setSid(sid);
		System.out.println("Enter Student Name:");
		String sname = sc.next();
		s.setSname(sname);
		System.out.println("Enter Batch Id:");
		int sbid = sc.nextInt();
		Iterator bitr1 = batchList.iterator();
		while (bitr1.hasNext())
		{
			Batch b2 = (Batch) bitr1.next();
			if (b2.getBid()==sbid)
			{
				flag=1;
				s.setBatch(b2.getBname());
			}
		}
		if (flag==0)
		{
			System.out.println("Invalid Faculty Id !");
		}
		studentList.add(s);
	}
	
	public void viewStudent()
	{
		System.out.println("Sid \t Sname \t Batch");
		Iterator sitr = studentList.iterator();
		while (sitr.hasNext())
		{
			Student s1 = (Student) sitr.next();
			System.out.println(s1.getSid() + "\t" + s1.getSname()+ "\t" + s1.getBatch());
		}
	}
}
