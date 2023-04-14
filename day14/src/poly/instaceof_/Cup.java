package poly.instaceof_;

public class Cup {
	// Field
	private String itemName;
	private int price;
	private final String companyName = "컵회사";
	
	public Cup(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	public Cup() {
		this("입력안됨", 0);
	}
}
