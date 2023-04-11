package example.encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyBirthday mb = new MyBirthday(1997, 2, 14);
		
		mb.showDateInfo();
		
		mb.setYear(2023);
		mb.setMonth(155);
		mb.setDay(2345);
		
		mb.showDateInfo();
	}
}
