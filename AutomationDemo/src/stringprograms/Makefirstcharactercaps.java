package stringprograms;

public class Makefirstcharactercaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "im ranjith im from madurai";
		String[] b = a.split(" ");
		String rev = "";
		for(String c : b) {
			
				rev = rev+ c.substring(0, 1).toUpperCase() + c.substring(1)+" ";
			
		}
		System.out.println(rev);
	

	}

}
