package interface_.example;

public class MainClass {
	public static void main(String[] args) {
		RemoteController rcrc = 
				new RobotCleanerRemoteController("S8", 1000000);
		TVRemoteController tvrc = 
				new TVRemoteController(60, 0);
		
		rcrc.turnOn();
		rcrc.turnOff();
		System.out.println(RemoteController.MAX_BATTERY);
		tvrc.turnOn();
		tvrc.turnOff();
		tvrc.setChannelUp();
		tvrc.setChannelDown();
	}
}