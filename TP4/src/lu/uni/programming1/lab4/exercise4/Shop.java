package lu.uni.programming1.lab4.exercise4;

import java.util.Random;

public class Shop {

	static int maxNumberOfGiveaways = 0;
	int localNumberOfGiveaways;

	public Shop(int localNumberOfPrices) {
		this.localNumberOfGiveaways = localNumberOfPrices;
	}

	public void buy(Item item) {
		System.out.printf("%.2f EUR were substracted from the customers bank account \n", item.getPrice());

		if (Shop.maxNumberOfGiveaways > 0 && this.localNumberOfGiveaways > 0) {

			int chance = 0;
			if (item.getPrice() < 20) {
				chance = 2;
			} else if (item.getPrice() < 100) {
				chance = 5;
			} else {
				chance = 10;
			}

			Random r = new Random();
			int dice = r.nextInt(100);

			if (dice < chance) {
				System.out.println("Congratulations you won a giveaway");
				Shop.maxNumberOfGiveaways--;
				this.localNumberOfGiveaways--;
			} else {
				System.out.println("Sorry, no giveaway for you this time...");
			}
		} else if (this.localNumberOfGiveaways == 0) {
			System.out.println("Unfortunately this shop ran out of giveaways");
		} else {
			System.out.println("No giveaways left at national level.");
		}
	}

	public int getLocalNumberOfGiveaways() {
		return this.localNumberOfGiveaways;
	}
}