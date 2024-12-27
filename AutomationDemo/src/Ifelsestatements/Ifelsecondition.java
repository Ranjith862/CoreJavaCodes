package Ifelsestatements;

import java.util.Scanner;

public class Ifelsecondition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.print("Hi Ranjith, Please enter your Score: ");
		int javascore = sc.nextInt();
		
		
		if((javascore  >= 70) && (javascore >= 80)) {
			System.out.println("Ranjith you get 'A' grade score in Java");
		}
		
		else if((javascore >= 60) && (javascore >= 50)) {
			System.out.println("Ranjith you get 'B' grade score in Java");
		}
		
		else if((javascore >= 40) && (javascore >= 35)) {
			System.out.println("Ranjith you get 'C' grade score in Java");
		}
		
		else {
			System.out.println("Ranjith you get 'D' grade score in Java");
		}
		
	}
	
}
