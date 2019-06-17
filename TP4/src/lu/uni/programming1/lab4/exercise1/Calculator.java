package lu.uni.programming1.lab4.exercise1;

public class Calculator {

	double value;

	public Calculator(double value) {
		this.value = value;
	}

	public Calculator() {
		this(0);
	}

	public double getValue() {
		return this.value;
	}

	public void add(double value) {
		this.value += value;
	}

	public void subtract(double value) {
		this.add(-value);
	}

	public void multiply(double value) {
		this.value *= value;
	}

	public void divide(double value) {
		if (value != 0) {
			this.multiply(1.0 / value);
		} else {
			System.out.println("You cannot divide by 0!");
		}
	}
}