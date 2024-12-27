package exchand_ling;
import java.util.Scanner;
public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//int b = scan.nextInt();
		//int c = 0;

		try {
			int a = scan.nextInt();
			//c = a / b; // Division might cause ArithmeticException (division by zero)
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			scan.close(); // Closing the scanner to prevent resource leaks
		}

		//System.out.println("Result: ");

	}

}
