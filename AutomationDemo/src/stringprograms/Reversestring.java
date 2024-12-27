package stringprograms;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Ranjith";
		String reverse = "";
		for(int i = a.length()-1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse);

	}

}
