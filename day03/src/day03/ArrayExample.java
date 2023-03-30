package day03;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int score[];
		
		score = new int[5];
		
		System.out.println(score);
		
		score[0] = 12;
		score[1] = 67;
		score[4] = 55;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		System.out.println(Arrays.toString(score));
		System.out.println(score.length);
		
		int[] iArr = new int[7];  // 배열의 선언과 생성을 동시에
		int[] iArr2 = {1, 3, 5, 7, 9};  // 배열의 선언과 초기화를 동시에
		
		System.out.println(Arrays.toString(iArr2));
	}
}