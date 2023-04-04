package day06;

// 1. 매개변수는 매소드 호출시 불완전한 문장을 채워주기 위해 사용
// 2. 매개변수에 어떤 값이 전달되는지에 따라 메소드 실행 결과 바뀜
// 3. 어떤 매개변수를 이용해 문장을 완성시킬지는 선언부에 작성
// 4. 매개변수가 필요 없는 경우 비움

public class MethodExample2 {
	public static void greet(String name) {
		System.out.println(name + "님 안녕하세요.");
	}
	
	public static void getThaiNumber() {
		System.out.println("능 : 1");
		System.out.println("썽 : 2");
		System.out.println("쌈 : 3");
		System.out.println("씨 : 4");
	}
	
	public static void main(String[] args) {
		greet("asdf");
		getThaiNumber();
	}
}
