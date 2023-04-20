package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		System.out.println(list);
		
		list.add(str1);
		list.add(str2);
		list.add("Database");
		list.add("MongoDB");
		list.add("Database");
		System.out.println(list);
		
		int size = list.size();
		System.out.println(size);
		
		list.add(2, "Network");
		System.out.println(list);
		
		//list[3] = "MySQL";
		list.set(3, "MySQL");
		System.out.println(list);
		
		String s = list.get(2);
		System.out.println(s);
		
		int idx = list.indexOf("Networ");
		System.out.println(idx);
		
		list.remove(5);
		System.out.println(list);
		list.remove(str1);
		System.out.println(list);
		
		System.out.println(list.contains(str1));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("item: " + list.get(i));
		}
		System.out.println("---------------------------");
		for(String str : list) {
			System.out.println("item: " + list.indexOf(str));
		}
		
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		ArrayList<Integer> list2 = null;
		System.out.println(list2.isEmpty());
	}
}
