package example.overload;

public class HumanMain {
	public static void main(String[] args) {
		// human 생성
		// void 생성자
		// 다른 하나 (String, int) 생성자
		Human h1 = new Human();
		Human h2 = new Human("Kim", 20);
	}
}
