package core.Java7;

public class User {
	private String name;
	static final int giftPrice=3000;
	private double gitCardPrice;
	public User(double price, String name) {
		this.gitCardPrice=price;
		this.name=name;
	}
	public void SetGiftPrice(double price) {
		this.gitCardPrice=price;
	}
	public double getGiftPrice() {
		return this.gitCardPrice;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}


}
