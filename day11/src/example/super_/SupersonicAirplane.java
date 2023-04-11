package example.super_;

public class SupersonicAirplane extends Airplane {

	// Constructors
	public SupersonicAirplane() {
		super();
	}
	public SupersonicAirplane(String planeCode) {
		super(planeCode);
	}
	
	// Methods
	@Override
	public void fly() {
		if(this.gas - 5 <= 0) {
			System.out.println("연료 부족입니다.");
			this.speed -= 50;
			return;
		}
		if(this.speed < 900) {
			super.fly();
		}
		else if(this.speed + 300 >= 2200) {
			this.speed = 2200;
			gas -= 5;
		}
		else {
			this.speed += 300;
			gas -= 5;
		}
	}
}
