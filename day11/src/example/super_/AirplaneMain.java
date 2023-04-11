package example.super_;

public class AirplaneMain {
	public static void main(String[] args) {
		Airplane air1 = new Airplane("747");
		SupersonicAirplane ssa1 = new SupersonicAirplane("콩코드");
		ssa1.showStatus();
		System.out.println();
		for(int i=0; i<50; i++) {
			ssa1.fly();
			ssa1.showStatus();
			System.out.println();
		}
	}
}
