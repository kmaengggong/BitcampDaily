package poly.inheri;

public class Warrior {
	// Fields
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	// Constructors
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// Getters, Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public void showStatus() {
		System.out.println("-----------------------");
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-----------------------");
	}
	
	public void hunt(Monster monster) {
		System.out.println(monster.getName() + "을 공격했습니다.");
		if(monster.getHp() <= 0) {
			System.out.println(monster.getName() + "은 이미 죽었습니다.");
			return;
		}
		monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
		if(monster.getHp() <= 0) {
			System.out.println(monster.getName() + "을 죽였습니다.");
			this.exp += monster.getExp();
			System.out.println(monster.getExp() + "만큼의 경험치를 얻었습니다.");
		}
		else {
			int damage = (monster.getAtk()-this.def);
			this.hp -= damage;
			System.out.printf("%s에게 %d만큼 데미지를 받았습니다.\n",
					monster.getName(), damage);
		}
	}
}
