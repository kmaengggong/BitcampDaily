package day02;

public class CharStringExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 66;
		char c3 = '\uAC00';  // '가'가 AC00. 유니코드 쓸 때 \ + u 붙여줘야됨.
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		String s1 = "my dream";
		String s2 = "is a developer";
		
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
	}
}
