package day04;

public class ForExample2 {
	public static void main(String[] args) {
		// 100 이하에서 7의 배수만 출력
		// 1. 0~100까지 돌리고 if문으로 7의 배수만 출력
		for(int i=0; i<101; i++) {
			if((i%7 == 0) && (i != 0)) System.out.println(i);
		}
		
		System.out.println("----------");
		
		// 2. 7부터 시작해서 7씩 더하기
		for(int j=7; j<101; j+= 7) {
			System.out.println(j);
		}
	}
}