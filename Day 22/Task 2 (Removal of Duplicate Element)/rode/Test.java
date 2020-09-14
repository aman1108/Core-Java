package rode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
		Set <Integer> s = new HashSet<>(a);
		System.out.println(s);
		Set <Integer> s1 = new LinkedHashSet<>(a);
		System.out.println(s1);
	}

}
