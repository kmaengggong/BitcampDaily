package day04;

public class ParseIntExample {
	public static void main(String[] args) {
		String str = "2002";
		int year = Integer.parseInt(str);
		
		System.out.println(year + 1);
		System.out.println(str + 1);

		String str2 = "abcd";
		Integer.parseInt(str2);
	}
}
