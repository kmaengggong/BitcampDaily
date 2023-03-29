package day02;

public class IntegerExample2 {
	public static void main(String[] args) {
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		// int d = 2147483648;
		long d = 2147483648l;
		
		System.out.println(d);
		
		// 2진수 저장시에는 매직넘버 앞에 0b
		int binary = 0b1111;
		// 8진수는 0
		int octal = 07777;
		// 16진수는 0x
		int hexadecimal = 0xFFFF;
		
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexadecimal);
	}
}