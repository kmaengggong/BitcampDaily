package poly.noinheri;

public class Ghost {
	private int hp;
	private int atk;
	private int def;
	
	public Ghost() {
		this.hp = 5;
		this.atk = 5;
		this.def = 0;
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
	
	public boolean isGhostActive() {
		return hp > 0 ? true : false;
	}
	
	public boolean isAttackedGhostActive(int userAtk) {
		return (hp - (userAtk-def)) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk-def);
	}
	
}
