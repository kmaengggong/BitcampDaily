package day03;

public class TernaryOperatorQuiz {
	public static void main(String[] args) {
		// 삼항연산자를 이용해서 난수로 얻은 값이
		// 7보다 크면 "당첨"
		// 7 이하이면 "낙점" 이라는 문자를 result에 저장 후 출력
		int randomNumber = (int)(Math.random() * 10);
		String result = ((randomNumber > 7) ? "당첨" : "낙첨");
		
		System.out.println(result);
	}
}
