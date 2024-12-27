package stringprograms;

public class Reverseofstringwithoutchangesplchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String a = "Username@123";
		        char[] b = a.toCharArray(); // Convert string to char array
		        int i = 0;                  // Initialize left pointer
		        int j = b.length - 1;       // Initialize right pointer to the last index

		        while (i < j) {
		            // Move the left pointer if it's not an alphabetic character
		            if (!Character.isAlphabetic(b[i])) {
		                i++;
		            }
		            // Move the right pointer if it's not an alphabetic character
		            else if (!Character.isAlphabetic(b[j])) {
		                j--;
		            } 
		            // If both are alphabetic, swap them
		            else {
		                char temp = b[i];
		                b[i] = b[j];
		                b[j] = temp;
		                i++;
		                j--;
		            }
		        }

		        // Print the resulting char array as a string
		        System.out.println(new String(b));
		

	}

}
