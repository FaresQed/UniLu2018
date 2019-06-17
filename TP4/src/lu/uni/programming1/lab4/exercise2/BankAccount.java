package lu.uni.programming1.lab4.exercise2;

public class BankAccount {

	Person holder;
	double balance;

	public BankAccount(Person holder, double balance) {
		this.holder = holder;
		this.balance = Math.max(balance, 0);
		this.printBalance();
	}

	public Person getHolder() {
		return this.holder;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			this.printBalance();
		}
	}

	public boolean withdraw(double amount) {
		if (0 < amount && amount <= this.balance) {
			this.balance -= amount;
			this.printBalance();
			return true;
		}

		System.out.println("Insufficient funds. Money cannot be withdrawn from the account of "
				+ this.getHolder().getName() + ".");
		return false;
	}

	public void printBalance() {
		System.out.println("Balance of the account of " + this.getHolder().getName() + "': " + this.balance);
	}

	public void transfer(BankAccount account, double amount) {
		if (this.withdraw(amount)) {
			account.deposit(amount);
			System.out.println("Transfer of " + amount + " EUR from account of " + this.getHolder().getName()
					+ " to account of " + account.getHolder().getName() + " was successful.");
		} else {
			System.out.println("Transfer could not be realized.");
		}
	}

	public static void main(String[] args) {

		Person denisZampunieris = new Person("Denis Zampunieris");
		Person steffenRothkugel = new Person("Steffen Rothkugel");

		BankAccount a1 = new BankAccount(denisZampunieris, 0);
		a1.deposit(50);
		a1.withdraw(20);

		BankAccount a2 = new BankAccount(steffenRothkugel, 0);
		a1.transfer(a2, 40);
		a1.deposit(10);
		a1.transfer(a2, 40);
	}
}