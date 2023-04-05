package day07;

public class HomeworkExample1 {
	public static void getPow(int n) {
		int result = n * n;
		System.out.println("입력된 수: " + n);
		System.out.println(n + "의 제곱수는 " + result);
	}
	public static void getIntroduce() {
		System.out.println("네이버클라우드 과정 6기 수업입니다.");
		System.out.println("기초 자바 진행중입니다.");
		System.out.println("메서드 파트를 진행중입니다.");
	}
	public static void loginCheck(String id, int password) {
		if(password == 3306)
			System.out.println(id + "님 환영합니다.");
		else
			System.out.println("비밀번호를 확인해 주세요.");
	}
	
	public static void main(String[] args) {
		getPow(5);
		getIntroduce();
		loginCheck("asdf", 3305);
		loginCheck("asdf", 3306);
	}
}
