package arrlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add(5);
		list.add("ABC");
		list.add(9);
		list.add("XYZ");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Object o= itr.next();
			if (o instanceof String)
			{
				String S= (String)o;
				System.out.println(S);
			}
			if (o instanceof Integer){
			int x = (int)o;
			System.out.println(x);
			}
		}
	}

}
