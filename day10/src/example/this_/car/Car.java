package example.this_.car;

public class Car {
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
		speed = 0;
	}
	
	void accel(int speed) {
		if(this.speed + speed >= 150) {
			this.speed = 150;
		}
		else {
			this.speed += speed;
		}
	}
	
	void showStatus() {
		System.out.println(this.model);
		System.out.println(this.speed);
	}
}
