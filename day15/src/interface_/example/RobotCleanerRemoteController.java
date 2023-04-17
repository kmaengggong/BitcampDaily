package interface_.example;

public class RobotCleanerRemoteController implements RemoteController{
	// Field
	public String modelName;
	public int price;
	
	// Constructors
	public RobotCleanerRemoteController(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
	}
	
	// Override Methods
	@Override
	public void turnOn() {
		System.out.println("로봇 청소기를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("로봇 청소기를 끕니다.");
	}
	
	// Show Methods
	public void showInfo() {
		System.out.println("모델명: " + this.modelName);
		System.out.println("가격: " + this.price);
	}
	
	// Methods
	public void startCleanRoom() {
		System.out.println("로봇 청소기가 청소를 시작합니다.");
	}
	public void quitCleanRoom() {
		System.out.println("로봇 청소기가 청소를 종료합니다.");
	}
}
