package day08;

public class Car {
	// 차종, 최대승객, 속도, 주인, 연료
	public String modelName;
	public int maxPassengers;
	public int currentSpeed;
	public String owner;
	public int gas;
	
	// Constructors
	public Car(String modelName, int maxPassengers, String owner) {
		this.modelName = modelName;
		this.maxPassengers = maxPassengers;
		this.currentSpeed = 0;
		this.owner = owner;
		this.gas = 0;
	}

	// Methods
	public void showTotalStatus() {
		System.out.println("차종: " + this.modelName);
		System.out.println("최대승객수: " + this.maxPassengers);
		System.out.println("현재속도: " + this.currentSpeed);
		System.out.println("차주: " + this.owner);
		System.out.println("연료량: " + this.gas);
	}
}
