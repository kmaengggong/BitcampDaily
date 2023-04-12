package poly.noinheri;

public class MainClass4 {
	public static void main(String[] args) {
		Warrior wari = new Warrior("전사");
		Magician magi = new Magician("마법사");
		
		Rabbit rab1 = new Rabbit();
		Rat rat1 = new Rat();
		Pig pig1 = new Pig();
		Ghost gho1 = new Ghost();
		
		/*
		wari.showStatus();
		wari.huntRabbit(rab1);
		wari.showStatus();
		while(rat1.getHp() > 0)
			wari.huntRat(rat1);
		wari.showStatus();
		while(pig1.getHp() > 0)
			wari.huntPig(pig1);
		wari.showStatus();
		while(gho1.getHp() > 0)
			wari.huntGhost(gho1);
		wari.showStatus();
		*/
		
		magi.showStatus();
		magi.huntRabbit(rab1);
		magi.showStatus();
		while(rat1.getHp() > 0)
			magi.huntRat(rat1);
		magi.showStatus();
		while(pig1.getHp() > 0)
			magi.huntPig(pig1);
		magi.showStatus();
		while(gho1.getHp() > 0)
			magi.huntGhost(gho1);
		magi.showStatus();
	}
}