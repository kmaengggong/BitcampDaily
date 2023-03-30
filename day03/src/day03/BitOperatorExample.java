package day03;

public class BitOperatorExample {
	public static void main(String[] args) {
		byte a = 5;  // 00000101
		byte b = 3;  // 00000011
		
		System.out.println(a & b);  // 비트곱 00000001
		System.out.println(a | b);  // 비트합 00000111
		System.out.println(a ^ b);  // 배타적 논리합 00000110
		System.out.println(a << b);  // 00101000
		System.out.println(a >> b);  // 00000000
	}
}
