package TS;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(2);

		Set<String> s1 = new TreeSet<>();
		s1.add("cc");
		s1.add("aa");
		s1.add("bb");
		
		System.out.println(s);
		System.out.println(s1);
		
	}

}
