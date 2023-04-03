package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakQuiz1 {
	public static void main(String[] args) throws IOException {
		// 1. 난수 2개 발생. 난수는 1~10
		// 2. while을 무한 루프. a * b 의 답은? 이라고 질문
		// 3. if문으로 비교해 정답 시 break. 오답인 경우 오답입니다 후 재입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 난수 발생
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		int correctAnswer = a * b;
		
		// a * b 의 답은?
		System.out.println(a + " * " + b + " 의 답은?");
		int uesrAnswer = Integer.parseInt(br.readLine());
		
		// while문
		while(true) {
			if(correctAnswer == uesrAnswer) break;
			else {
				System.out.println("오답입니다");
				uesrAnswer = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("정답입니다!");
	}
}