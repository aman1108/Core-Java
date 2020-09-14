package uhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String args[])
	{
		Map <Integer,String> m =new HashMap<Integer, String>();
		System.out.println(m.put(1,"abc"));
		System.out.println(m.put(2,"xyz"));
		System.out.println(m.put(3,"pqr"));
		System.out.println(m.put(1,"ghi"));
		Set<Integer> keys = m.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			String value = m.get(key);
			System.out.println(key + "----------" + value);
		}
		
	}

}
