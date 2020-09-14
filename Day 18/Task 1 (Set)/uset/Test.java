package uset;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Set<String> s= new HashSet<>();
		System.out.println(s.add("abc"));
		System.out.println(s.add("xyz"));
		System.out.println(s.add("pqr"));
		System.out.println(s.add("Abc"));
		Iterator<String> itr= s.iterator();
		while(itr.hasNext())
		{
			String u =itr.next();
			System.out.println(u);
		}

	}

}
