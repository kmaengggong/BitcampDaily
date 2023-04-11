package example.encap.bad;

public class MyBirthday {
	int year;
	int month;
	int day;
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(this.year + "년");
		System.out.println(this.month + "월");
		System.out.println(this.day + "일");
	}
}
