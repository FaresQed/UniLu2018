package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		Scanner scanner = new Scanner(System.in);
		int choice;
		double value;

		while (true) {
			do {
				System.out.println("Calculator Menu:");
				System.out.println("- Add (1)");
				System.out.println("- Substract (2)");
				System.out.println("- Multiply (3)");
				System.out.println("- Divide (4)");
				System.out.println("- Stop (0)");

				choice = scanner.nextInt();
			} while (!(choice >= 0 && choice <= 4));

			if (choice == 0) {
				System.out.println("Final value: " + c.getValue());
				break;
			} else {
				System.out.print("Enter a value: ");
				value = scanner.nextDouble();

				switch (choice) {
				case 1:
					c.add(value);
					break;
				case 2:
					c.subtract(value);
					break;
				case 3:
					c.multiply(value);
					break;
				case 4:
					c.divide(value);
					break;
				default:
					break;
				}

				System.out.println("New value: " + c.getValue());
			}
		}

		scanner.close();
	}
}