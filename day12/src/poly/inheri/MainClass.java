package poly.inheri;

public class MainClass {
	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사");
		Rabbit rab1 = new Rabbit();
		Rat rat1 = new Rat();
		
		w1.showStatus();
		while(rab1.getHp() > 0)
			w1.hunt(rab1);
		w1.showStatus();
		while(rat1.getHp() > 0)	
			w1.hunt(rat1);
		w1.showStatus();
	}
}
