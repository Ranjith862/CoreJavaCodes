package Ifelsestatements;

import java.util.Scanner;

public class Nestedifstatement {

	public static void main(String args[]) {
		Scanner scannar = new Scanner(System.in);
		System.out.println("Hello Ranjith, We help you to know about your car grade.");
		System.out.println("Enter your model name for you car:  ");
	    String carname = scannar.nextLine();
	    String a = "Tesla";
	    String b = "Lucid";
	    String c = "Audi";
	    String d = "Ferrari";
	    String e = "Bentley";
		if((carname.equals(a)) || (carname.equals(b))) {
			System.out.println("Your car grade is 'Electric luxury grade'");
		}
		else if ((carname.equals(c)) || (carname.equals(d) )) {
			System.out.println("Your car grade is 'Performance-oriented luxury'");
		}
		else if (carname.equals(e)){
			System.out.println("Your car grade is 'Grand touring luxury'");
		}
		else {
			System.out.println("Your car name is not matched to the grade of car, Please recheck once...");
		}
		
		
		
		
	}
}
