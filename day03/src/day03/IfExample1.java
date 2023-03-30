package day03;

public class IfExample1 {
	public static void main(String[] args) {
		// Q. 아래 문항과 Math.random() * 101를 괄호로 감싸지 않았을 때의 차이점.
		// A. (int)가 단항 연산자이므로 이항 연산자인 *보다 먼저 실행.
		// 즉 0 < x <= 1 이므로 정수로 바꾸면 그냥 0으로 바뀜.
		// 따라서 여기(0)에 101을 곱해도 0이 나옴.
		int score = (int)(Math.random()*101);
		
		System.out.println(score);
		if(score >= 60) System.out.println("당신은 합격했습니다! 축하합니다.");
		else System.out.println("당신은 탈락했습니다1 축하합니다,");
	}
}
