package api.util.random;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random ran = new Random();
		
		double d = ran.nextDouble();
		System.out.println("실수 랜덤 값: " + d);
		
		boolean b = ran.nextBoolean();
		System.out.println("논리 랜덤 값: " + b);
		
		int i = ran.nextInt();
		System.out.println("정수 랜덤 값: " + i);
	}
}
