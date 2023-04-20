package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
	
		map.put("치킨",  30000);
		map.put("라면", 4000);
		map.put("탕수육", 20000);
		map.put("치킨", 25000);
		map.put("김밥", 4000);
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		int price = map.get("탕수육");
		System.out.println(price);
		
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		System.out.println(map.values());
		
		Iterator<String> itr = kSet.iterator();
		while(itr.hasNext()) {
			System.out.println("key: " + itr.next());
		}
		Iterator<Integer> itr2 = map.values().iterator();
		while(itr2.hasNext()) {
			System.out.println("value: " + itr2.next());
		}
		for(int value : map.values()) {
			System.out.println("values " + value);
		}
	}
}
