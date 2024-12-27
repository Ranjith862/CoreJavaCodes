package stringprograms;

public class Reverseofthesentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hi Im Ranjith, Im from madurai.";
		String[] b = a.split(" ");
		String rev = " ";
		for(int i = b.length -1; i >= 0; i--) {
			rev = rev + b[i] + " ";
			
		}
		 
		System.out.println(rev.trim());
	}

}
