package alist;

import java.util.*;

public class Test {
	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add(5);
		list.add(9);
		int a = (int)list.get(1);
		System.out.println(a);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			int x = (int)itr.next();
			System.out.println(x);
		}
	}

}
