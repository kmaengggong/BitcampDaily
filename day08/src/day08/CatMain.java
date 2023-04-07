package day08;

public class CatMain {	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "모린";
		c1.age = 7;
		c1.kind = "스트리트";
		c1.color = "검은색";
		
		Cat c2 = new Cat();
		c2.name = "만두";
		c2.age = 5;
		c2.kind = "스트리트";
		c2.color = "흰색";
		
		c1.printCat();
		c2.printCat();
	}
}
