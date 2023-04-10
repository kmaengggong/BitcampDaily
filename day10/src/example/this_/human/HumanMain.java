package example.this_.human;

public class HumanMain {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human("Kim");
		Human h3 = new Human("Lee", 20);
		
		h1.showInfo();
		h2.showInfo();
		h3.showInfo();
	}
}
