package poly.inheri;

public class MainClass1 {
	public static void main(String[] args) {
		Warrior war1 = new Warrior("전사");
		Rabbit rab1 = new Rabbit();
		Rat rat1 = new Rat();
		
		war1.showStatus();
		while(rab1.getHp() > 0) war1.hunt(rab1);
		war1.showStatus();
		while(rat1.getHp() > 0) war1.hunt(rat1);
		war1.showStatus();
	}
}
