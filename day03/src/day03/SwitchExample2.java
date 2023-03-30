package day03;

public class SwitchExample2 {
	public static void main(String[] args) {
		String foods[] = { "햄버거", "양념치킨", "피자", "냉면", "자장면" };
	
		int idx = (int)(Math.random()*5);
		
		switch(foods[idx]) {
			case "햄버거":
				System.out.println("미국 음식입니다!");
				break;
			case "양념치킨":
				System.out.println("한국 음식입니다!");
				break;
			case "피자":
				System.out.println("이탈리아 음식입니다!");
				break;
			default:
				System.out.println("기타 요리입니다!");
				break;
		}
	}
}
