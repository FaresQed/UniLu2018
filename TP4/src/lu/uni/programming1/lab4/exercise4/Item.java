package lu.uni.programming1.lab4.exercise4;

public class Item {

	double price;

	public Item(double price) {
		this.price = Math.abs(price);
	}

	public double getPrice() {
		return this.price;
	}
}