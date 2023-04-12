package poly.noinheri;

public class MainClass2 {
	public static void main(String[] args) {
		Warrior war = new Warrior("전사");
		Rabbit rab1 = new Rabbit();
		Rabbit rab2 = new Rabbit();
		Rat rat1 = new Rat();
		Rat rat2 = new Rat();
		
		war.showStatus();
		
		war.huntRabbit(rab1);
		war.showStatus();
		
		war.huntRabbit(rab2);
		war.showStatus();
		
		war.huntRat(rat1);
		war.showStatus();
		
		war.huntRat(rat2);
		war.showStatus();
	}
}
