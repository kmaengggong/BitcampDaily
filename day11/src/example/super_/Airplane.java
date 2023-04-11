package example.super_;

public class Airplane {
	protected String planeCode;
	protected int speed;
	protected int gas;
	
	// Constructors
	public Airplane() {}
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	
	// Getter, Setter
	
	// Methods
	public void fly() {
		if(this.gas - 3 <= 0) {
			System.out.println("연료가 부족합니다.");
			this.speed -= 50;
			return;
		}
		if(this.speed + 100 >= 900) {
			this.speed = 900;
			this.gas -= 3;
		}
		else {
			this.speed += 100;
			this.gas -= 3;
		}
	}
	public void showStatus() {
		System.out.println("편명: " + this.planeCode);
		System.out.println("속도: " + this.speed);
		System.out.println("연료: " + this.gas);
	}
}
