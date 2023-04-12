package poly.noinheri;

public class Rabbit {
	// Member Variables
	private int hp;
	private int atk;
	private int def;
	
	// Constructors
	public Rabbit() {
		this.hp = 3;
		this.atk = 0;
		this.def = 0;
	}
	
	// Getters, Setters
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
}
