package com.cjc.admin;
import com.cjc.services.*;
import java.util.*;

public class Test {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Operation o = new Operation();
		try
		{
		while (1==1)
		{
			System.out.println("Press 1 : To add Course \n");
			System.out.println("Press 2 : To view Course\n");
			System.out.println("Press 3 : To add Faculty \n");
			System.out.println("Press 4 : To view Faculty \n");
			System.out.println("Press 5 : To add Batch \n");
			System.out.println("Press 6 : To view Batch \n");
			System.out.println("Press 7 : To add Student \n");
			System.out.println("Press 8 : To view Student \n");
			System.out.println("Press 9 : To Exit \n");
			System.out.println("-----------------------");
			System.out.println("Enter your choice");
			
			int m= sc.nextInt();
			
			if (m==1)
			{
				o.addCourse();
			}
			else if (m==2)
			{
				o.viewCourse();
			}
			else if (m==3)
			{
				o.addFaculty();
			}
			else if(m==4)
			{
				o.viewFaculty();
			}
			else if (m==5)
			{
				o.addBatch();
			}
			else if (m==6)
			{
				o.viewBatch();
			}
			else if (m==7)
			{
				o.addStudent();
			}
			else if (m==8)
			{
				o.viewStudent();
			}
			else if (m==9)
			{
				break;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("Invalid M !");
			
		}
	}
}
