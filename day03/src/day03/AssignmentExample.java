package day03;

public class AssignmentExample {
	public static void main(String[] args) {
		int a = 5, b = 5;
		
		a += 3;
		System.out.println(a);
		
		b /= 2;  // b = b / 2 -> 5 / 2를 b에 대입
		System.out.println(b);
		
		b = 5;
		b %= 2;	// b = b % 2 -> 5 % 2를 b에 대입
		System.out.println(b);
	}
}
