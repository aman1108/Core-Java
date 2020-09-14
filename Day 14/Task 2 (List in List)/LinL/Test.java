package LinL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static void main(String args[])
	{
		List mh = new ArrayList();
		mh.add("Mumbai");
		mh.add("Nagpur");
		List jh= new ArrayList();
		jh.add("Ranchi");
		jh.add("XYZ");
		List India= new ArrayList();
		India.add(mh);
		India.add(jh);
		
		Iterator itr=India.iterator();
		while (itr.hasNext())
		{
			List list = (List)itr.next();
			Iterator itr1= list.iterator();
			while (itr1.hasNext())
			{
				String city=(String)itr1.next();
				System.out.println(city);
			}
		}
	
	}
	
}
