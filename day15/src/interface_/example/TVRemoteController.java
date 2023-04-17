package interface_.example;

public class TVRemoteController implements RemoteController{
	// Field
	public final int inch;
	public int channel = 0;
	
	// Constructors
	public TVRemoteController(int inch, int channel) {
		this.inch = inch;
		this.channel = channel;
	}
	
	// Override Methods
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	// Methods
	public void setChannelUp() {
		if(this.channel < 999) this.channel += 1;
	}
	public void setChannelDown() {
		if(this.channel > 0) this.channel -= 1; 
	}
	
	public void setChannel(int channel) {
		if(channel < 0 && channel > 999) this.channel = 1;
		else this.channel = channel;
	}
}
