package day08;

public class Car2 {
	// 차종, 최대승객, 속도, 주인, 연료
	private String modelName;
	private int maxPassengers;
	private int currentSpeed;
	private String owner;
	private int gas;
	private int location;
	
	private final static int BOOST_SPEED = 1;
	private final static int BREAK_SPEED = 1;
	private final static int MOVE_TIME = 100;
	
	// Constructor
	public Car2() {
		this.currentSpeed = 0;
		this.location = 0;
	};
	public Car2(String modelName, int maxPassengers, String owner, int gas) {
		this.modelName = modelName;
		this.maxPassengers = maxPassengers;
		this.owner = owner;
		this.gas = gas;
		this.currentSpeed = 0;
		this.location = 0;
	}
	
	// Get Set
	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getMaxPassengers() {
		return this.maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	public int getCurrentSpeed() {
		return this.currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getGas() {
		return this.gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	// Function
	public void accelerate() {
		this.currentSpeed += BOOST_SPEED;
		this.gas -= 10;
	}
	public void break_() {
		if(this.currentSpeed != 0)
			this.currentSpeed -= BREAK_SPEED;
		this.gas -= 10;
	}
	
	// Show
	public void showTotalStatus() {
		System.out.println("차종: " + this.modelName);
		System.out.println("최대승객수: " + this.maxPassengers);
		System.out.println("현재속도: " + this.currentSpeed);
		System.out.println("차주: " + this.owner);
		System.out.println("연료량: " + this.gas);
		System.out.println("현재위치: " + this.location);
		for(int i=0; i<this.location; i++) {
			System.out.print(".");
		}
		System.out.println("(o-o)");
	}
	public void showStatus() throws InterruptedException {
		this.location += this.currentSpeed;
		System.out.println("차종: " + this.modelName +
				", 현재속도: " + this.currentSpeed + 
				", 연료량: " + this.gas + 
				", 현재위치: " + this.location
		);

		for(int i=0; i<this.location; i++) {
			Thread.sleep(MOVE_TIME);
			System.out.print(".");
		}
		Thread.sleep(MOVE_TIME);
		System.out.println("(o-o)");
	}
}
