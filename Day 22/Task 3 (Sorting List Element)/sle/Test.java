package sle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		List <Integer> a= new ArrayList<>();
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(2);
		a.add(6);
		System.out.println(a);
		Set <Integer> s = new TreeSet<>(a);
		System.out.println(s); 
		Collections.sort(a);
		System.out.println(Collections.binarySearch(a, 4));
		System.out.println(a);
	}
}
