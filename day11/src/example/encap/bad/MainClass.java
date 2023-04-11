package example.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		MyBirthday mb = new MyBirthday();
		
		mb.year = 2023;
		mb.month = 13;
		mb.day = 32;
		
		mb.showDateInfo();
	}
}
