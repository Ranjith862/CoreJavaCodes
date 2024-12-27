package exchand_ling;

import java.util.Scanner;

public class Program_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numerator = scan.nextInt();
		int denominator = scan.nextInt();

		DivisionExample d1 = new DivisionExample();
		d1.dividNumbers(numerator, denominator);
	}

}

class DivisionExample {
	void dividNumbers(int numerator, int denominator) {
		try {
			int result = numerator / denominator;
			System.out.println("Result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divided by Zero " + e);
		}
	}
}