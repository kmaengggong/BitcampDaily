package day04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int orderPrice = 0;
		
		do {
			System.out.println("할인혜택을 받았습니다.");
			System.out.println("다음 구매금액은?");
			orderPrice = sc.nextInt();
		} while(orderPrice >= 15000);
		
		sc.close();
	}
}
