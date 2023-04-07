package day08;

public class CarMain2 {
	public static void main(String[] args) throws InterruptedException {
		// 자동차 한 대 생성
		// 연료 100, 속도 0, 나머지 요소 자율적
		// 엑셀 3벌 밟고, 계기판 조회, 브레이크 2번 밟고, 계기판 조회
		Car2 car1 = new Car2();
		car1.setModelName("에스페로");
		car1.setMaxPassengers(5);
		car1.setOwner("대우");
		car1.setGas(100);
		
		/*
		car1.showStatus();
		car1.accelerate();
		car1.showStatus();
		car1.break_();
		car1.showStatus();
		*/
		
		Car2 car2 = new Car2("아반떼", 5, "횬다이", 50);
		car2.showTotalStatus();
		System.out.println();
		while(car2.getGas() > 0) {
			car2.accelerate();
			car2.showStatus();
			System.out.println();
		}
		if(car2.getGas() == 0) {
			while(car2.getCurrentSpeed() > 0) {
				car2.setCurrentSpeed(car2.getCurrentSpeed()-1);
				car2.showStatus();
				System.out.println();
			}
		}
	}
}
