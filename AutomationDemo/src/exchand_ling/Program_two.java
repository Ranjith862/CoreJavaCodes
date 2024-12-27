package exchand_ling;

import java.util.Scanner;

public class Program_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Custom Exception:
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();

		// Object creation for AgeValidator:
		AgeValidator a1 = new AgeValidator();
		a1.checkAge(age);
	}

}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeValidator {
	void checkAge(int age) {
		try {
			if ((age < 0) || (age > 80)) {
				throw new InvalidAgeException("Your age is Invalid!"); // Object created
			}
			else {
				System.out.println("Your age is Valid!");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}
}