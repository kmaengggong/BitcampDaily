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
	public void hunt(Monster monster) {
		showUserAttackedMonster(monster.getName());
		// 살아있는지 확인
		if(monster.isInactive()) {
			showMonsterAleadyDead(monster.getName());
			return;
		}
		// 데미지 가산
		monster.setHpAfterUserAttack(this.atk);
		// 데미지 가산 후 살아있는지 확인
		if(!monster.isInactive()) {
			int damage = getDamageByMonsterAttack(monster.getAtk());
			setHpAfterMonsterAttack(damage);
			showAfterMonsterAttack(monster.getName(), damage);
		}
		else {
			gainMonsterExp(monster.getExp());
			showMonsterDeadByUser(monster.getName());
			showUserExpAfterKilledMonster(monster.getExp());
		}
	}
	
	// Get, Set, Gain
	public int getDamageByMonsterAttack(int monsterAtk) {
		if(monsterAtk <= 0) return 0;
		else {
			return monsterAtk-this.def <= 0 ? 1 : monsterAtk-this.def;
		}
	}
	public void setHpAfterMonsterAttack(int damage) {
		this.hp -= damage;
	}
	public void gainMonsterExp(int exp) {
		this.exp += exp;
	}
	
	// Show Methods
	public void showLines() {
		System.out.println("-----------------------");
	}
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		showLines();
	}
	public void showUserAttackedMonster(String monsterName) {
		System.out.println(monsterName + "을(를) 공격했습니다.");
		showLines();
	}
	public void showMonsterAleadyDead(String monsterName) {
		System.out.println(monsterName + "은(는) 이미 죽었습니다.");
		showLines();
	}
	public void showAfterMonsterAttack(String monsterName, int damage) {
		System.out.printf("%s에게 %d만큼 데미지를 받았습니다.\n", monsterName, damage);
		showLines();
	}
	public void showMonsterDeadByUser(String monsterName) {
		System.out.println(monsterName + "을(를) 죽였습니다.");
		showLines();
	}
	public void showUserExpAfterKilledMonster(int monsterExp) {
		System.out.println(monsterExp + "만큼의 경험치를 얻었습니다.");
		showLines();
	}
}
