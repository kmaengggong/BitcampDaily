package day03;

public class IfQuiz {
	public static void main(String[] args) {
		// 정수 입력합니다. 음수라면
		// "음수입니다" 0이라면
		// "0입니다". 라고 출력
		// 하고 단, 양수의 경우 짝수라면
		// "짝수 양수입니다", 홀수라면
		// "홀수 양수입니다", 만드셈
		
		//int number = 2023;
		//int number = 4;
		//int number = -1;
		int number = 0;
		
		if(number == 0) System.out.println("0입니다");
		else if(number < 0) System.out.println("음수입니다");
		else {
			if(number%2 == 0) System.out.println("짝수 양수입니다");
			else System.out.println("짝수 홀수입니다");
		}
	}
}
