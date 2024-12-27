package exchand_ling;

import java.util.Scanner;

public class Throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		try {
			int a = scan.nextInt();
			if (a < 18) {
				throw new Exception("Your age should be more that 18."); // throw keyword is used to create exception
																			// inside the try block manually.
			} else {
				System.out.println("Your age is more than 18.");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}
