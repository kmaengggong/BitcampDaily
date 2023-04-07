package day08;

public class BasketballPlayer {
	public String name;
	public int height;
	public int age;
	public int salary;
	
	public BasketballPlayer(String name, int height, int age, int salary) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("신장: " + this.height);
		System.out.println("나이: " + this.age);
		System.out.println("연봉: " + this.salary);
	}
	public void dunkShoot() {
		if(this.height > 190) System.out.println("덩크슛 성공.");
		else System.out.println("농구는 신장이 아니라 심장으로 하는거야.");
	}
}
