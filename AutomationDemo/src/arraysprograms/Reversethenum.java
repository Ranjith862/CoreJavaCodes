package arraysprograms;

public class Reversethenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		String rev = "";
		for(int i = a.length -1; i >= 0; i--) {
			rev = rev + a[i] + " ";
		}
		System.out.println(rev.trim());

	}

}
