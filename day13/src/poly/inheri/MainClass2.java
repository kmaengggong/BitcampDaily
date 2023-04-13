package poly.inheri;

public class MainClass2 {
	public static void main(String[] args) {
		Magician magi = new Magician("법사");
		Rabbit rab1 = new Rabbit();
		Rabbit rab2 = new Rabbit();
		Rabbit rab3 = new Rabbit();
		Rat rat1 = new Rat();
		Rat rat2 = new Rat();
		Rat rat3 = new Rat();
		
		magi.showStatus();
		while(rab1.getHp() > 0) magi.hunt(rab1);
		magi.showStatus();
		while(rab2.getHp() > 0) magi.castFireball(rab2);
		magi.showStatus();
		while(rab3.getHp() > 0) magi.hunt(rab3);
		magi.showStatus();
		while(rat1.getHp() > 0) magi.castFireball(rat1);
		magi.showStatus();
		while(rat2.getHp() > 0) magi.hunt(rat2);
		magi.showStatus();
		while(rat3.getHp() > 0) magi.castFireball(rat3);
		magi.showStatus();
		
	}
}
