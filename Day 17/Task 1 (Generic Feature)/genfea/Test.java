package genfea;

import java.util.*;

public class Test {

	public static void main(String args[])
	{
		List<String> mh= new ArrayList<String>();
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> jh= new ArrayList<String>();
		jh.add("Ranchi");
		jh.add("LohaNagar");
		
		List<List<String>> India = new ArrayList<>();
		India.add(mh);
		India.add(jh);
		
		for(List<String> list : India)
		{
			for (String city : list)
			{
				System.out.println(city);
			}
		}
	}
}
