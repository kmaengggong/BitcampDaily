package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("닭강정");
		set.add("김밥");
		set.add("김말이");
		set.add("단무지");
		set.add("김밥");
		
		System.out.println(set.size());
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.equals("단무지")) {
				System.out.println(s);
				break;
			}
		}
		
		set.clear();
		System.out.println(set);
		if(set.isEmpty()) System.out.println("Set is empty");
		else System.out.println("Set is not empty");
	}
}