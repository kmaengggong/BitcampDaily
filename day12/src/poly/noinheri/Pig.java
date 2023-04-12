package poly.noinheri;

public class Pig {
	private int hp;
	private int atk;
	private int def;
	
	public Pig() {
		this.hp = 10;
		this.atk = 1;
		this.def = 2;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public boolean isPigActive() {
		return hp > 0 ? true : false;
	}
	
	public boolean isAttackedPigActive(int userAtk) {
		return (this.hp - (userAtk-this.def)) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk-this.def);
	}
	
}
