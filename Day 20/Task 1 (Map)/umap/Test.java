package umap;
import java.util.*;

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
		
		Set<String> state = india.keySet();
		Iterator<String> itr = state.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key);
			List<String> city = india.get(key);
			Iterator<String> itr1 = city.iterator();
			while(itr1.hasNext())
			{
				String key1 = itr1.next();
				System.out.println(key1);
			}
		}
		
	}

}
