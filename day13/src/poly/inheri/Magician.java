package poly.inheri;

public class Magician {
	// Field
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// Constructors
	public Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.def = 0;
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
	public void hunt(Monster monster) {
		showAttackMonsterMessage(monster.getName(), "일반");
		if(monster.isInactive()) {
			monster.showDeadAlreadyMessage();
		}
		monster.setHpAfterUserAttack(this.atk);
		if(!monster.isInactive()) {
			int damage = getAttackDamage(monster.getAtk());
			setHpAfterMonsterAttack(monster.getName(), damage);
		}
		else {
			monster.showDeadMessage();
			gainExpByKillMonster(monster.getExp());
		}
	}
	public void castFireball(Monster monster) {
		showAttackMonsterMessage(monster.getName(), "화염구");
		if(monster.isInactive()) {
			monster.showDeadAlreadyMessage();
		}
		monster.setHpAfterUserAttack(this.atk*2);
		if(!monster.isInactive()) {
			int damage = getAttackDamage(monster.getAtk());
			setHpAfterMonsterAttack(monster.getName(), damage);
		}
		else {
			monster.showDeadMessage();
			gainExpByKillMonster(monster.getExp());
		}
	}
	
	// Get, Set, Gain
	public int getAttackDamage(int monsterAtk) {
		if(monsterAtk <= 0) return 0;
		else {
			return monsterAtk-this.def <= 0 ? 0 : monsterAtk-this.def;
		}
	}
	public void setHpAfterMonsterAttack(String monsterName, int damage) {
		this.hp -= damage;
		showMonsterAttackMessage(monsterName, damage);
	}
	public void gainExpByKillMonster(int monsterExp) {
		this.exp += monsterExp;
		showExpGainedByKillMonster(monsterExp);
	}
	
	// Show Methods
	public void showLine() {
		System.out.println("-----------------------");
	}
	public void showStatus() {
		System.out.println("이름: " + this.id);
		System.out.println("체력: " + this.hp);
		System.out.println("공격력: " + this.atk);
		System.out.println("방어력: " + this.def);
		System.out.println("경험치: " + this.exp);
		showLine();
	}
	public void showAttackMonsterMessage(String monsterName, String typeOfAttack) {
		System.out.printf("%s을(를) %s 공격했습니다.\n", monsterName, typeOfAttack);
		showLine();
	}
	public void showMonsterAttackMessage(String monsterName, int damage) {
		System.out.printf("%s에게 %d의 데미지를 받았습니다.\n", monsterName, damage);
		showLine();
	}
	public void showExpGainedByKillMonster(int monsterExp) {
		System.out.printf("%d만큼의 경험치를 획득했습니다.\n", monsterExp);
		showLine();
	}
}
