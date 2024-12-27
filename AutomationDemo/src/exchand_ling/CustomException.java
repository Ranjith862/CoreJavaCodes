package exchand_ling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter the first number (a): ");
			int a = scan.nextInt();
			System.out.print("Enter the second number (b): ");
			int b = scan.nextInt();

			if (b == 0) { // Check for division by zero
				throw new NotDivisibleByZero("Division by zero is not allowed.");
			}
			int c = a / b;
			if (c == 0) {
				throw new NotDivisibleByZero("Result of the division is 0, which is not allowed in this program.");
			} else {
				System.out.println(a + " Divide by " + b + " is: " + c);
			}

		} catch (NotDivisibleByZero e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scan.close();
		}

	}

}

class NotDivisibleByZero extends Exception {
	NotDivisibleByZero(String message) {
		super(message);
	}
}
