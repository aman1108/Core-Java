package mim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		List <String> mh = new ArrayList<>();
		mh.add("Nagpur");
		mh.add("Mumbai");
		List <String> jh = new ArrayList<>();
		jh.add("Lohandaga");
		jh.add("Ranchi");
		Map <String,List<String>> india= new HashMap<>();
		india.put("Maharastra", mh);
		india.put("Jharkhand", jh);
		
		List <String> s1 = new ArrayList<>();
		s1.add("City1");
		s1.add("City2");
		List <String> s2 = new ArrayList<>();
		s2.add("City 3");
		s2.add("City 4");
		Map <String,List<String>> c= new HashMap<>();
		c.put("State1", s1);
		c.put("State2", s2);
		
		Map<String,Map <String,List<String>>> world = new HashMap<>();
		world.put("India", india);
		world.put("Country 2",c);
		
		Set<String> country = world.keySet();
		Iterator<String> itr= country.iterator();
		while(itr.hasNext())
		{
			String keys = itr.next();
			System.out.println(keys);
			Map <String,List<String>> m = world.get(keys);
			Set<String> state = m.keySet();
			Iterator<String> itr1 = state.iterator();
			while (itr1.hasNext())
			{
				String keys1 = itr1.next();
				System.out.println(keys1);
				List<String> l = m.get(keys1);
				Iterator<String> itr2 = l.iterator();
				while (itr2.hasNext())
				{
					String city = itr2.next();
					System.out.println(city);
				}
			}
		}
	}
}
