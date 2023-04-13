package poly.inheri;

public class Monster {
	// Fields
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// Constructors
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	
	// Getters, Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}

	// Methods
	public boolean isInactive() {
		return (this.hp <= 0) ? true : false;
	}
	public void setHpAfterUserAttack(int userAtk) {
		if(this.hp - (userAtk - this.def) < 0) this.hp = 0;
		else this.hp -= userAtk - this.def;
	}
	
	// Show Methods
	public void showLine() {
		System.out.println("-----------------------");
	}
	public void showDeadMessage() {
		System.out.println(this.name + "이(가) 죽었습니다.");
		showLine();
	}
	public void showDeadAlreadyMessage() {
		System.out.println(this.name + "은(는) 이미 죽었습니다.");
		showLine();
	}
}
