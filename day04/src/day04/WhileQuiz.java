package day04;

import java.util.Scanner;

public class WhileQuiz {
	public static void main(String[] args) {
		/* 원본 코드
		// 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.
		
		// 이 프로그램은 먼저 Math.random()을 이용해서 수를 하나 얻습니다.
		int comValue = (int)(Math.random() * 101);// 0 ~ 100 숫자 하나 선택됨 
		
		// 스캐너를 생성해주세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0 ~ 100 사이의 숫자를 입력해주세요.");
		// 사용자에게 숫자를 입력받게 해 주세요.
		int userValue = scan.nextInt();
		
		// 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시엔 계속 진행하도록 처리
		while(comValue != userValue) {
			// 불일치라면 먼저 업인지, 다운인지 알려주기
			// comValue와 userValue의 비교를 통해 업/다운을 판단할 수 있다.
			if(comValue > userValue) {
				System.out.println("업입니다.");
			}else {
				System.out.println("다운입니다.");
			}
			// 사용자한테 userValue를 다시 입력받기
			System.out.println("다시 입력해주세요.");
			userValue = scan.nextInt();
		*/ // 원본 코드 끝
		
		// 1. 0~100인 범위를 0~사용자가 입력한 값으로 설정할 수 있게 수정
		// 2. 위에 적힌 범위를 벗어나는 숫자가 들어오면 다시 입력받도록 수정
		// 3. 몇 번 시도 끝에 정답 맞추었는지 알려주도록 수정
		Scanner scan = new Scanner(System.in);
		
		// 1. 0~100인 범위를 0~사용자가 입력한 값으로 설정할 수 있게 수정
		System.out.print("원하는 범위를 입력하세요(양의 정수): ");
		int userLength = scan.nextInt();
		int comValue = (int)(Math.random() * userLength+1);
		int userValue;
		
		// 맞추는 반복문
		// 3. 몇 번 시도 끝에 정답 맞추었는지 알려주도록 수정
		int tryCount = 0;
		do {
			System.out.print("0 ~ " + userLength + " 사이의 숫자를 입력해주세요: ");
			userValue = scan.nextInt();
			
			// 2. 위에 적힌 범위를 벗어나는 숫자가 들어오면 다시 입력받도록 수정
			if(userValue > userLength || userValue < 0) {
				System.out.println("0 ~ " + userLength + " 범위에 맞게 다시 입력해주세요.");
				continue;
			}
			
			if(comValue > userValue) {
				System.out.println("업입니다.");
				System.out.println("다시 입력해주세요.");
			}else if(comValue < userValue) {
				System.out.println("다운입니다.");
				System.out.println("다시 입력해주세요.");
			}
			tryCount++;
		} while(comValue != userValue);
		System.out.println(tryCount + "번째 시도만에 맞추셨습니다!");
	}
}