package stringprograms;

public class Separatevowelsandconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Usernamepassword@123454934#!";
		String vowels = "";
		String consonants = "";
		String numbers = "";
		for(int i = 0; i < a.length();i++) {
			if((a.charAt(i) == 'a') || (a.charAt(i) == 'e') ||(a.charAt(i) == 'i') ||(a.charAt(i) == 'o') ||(a.charAt(i) == 'u') ) {
				vowels = vowels + a.charAt(i);
			}
			else if ((a.charAt(i) >= '0') && (a.charAt(i) <= '9')){
				numbers = numbers + a.charAt(i);
			}
			else {
				consonants = consonants + a.charAt(i);
			}
			
		}
		System.out.println("Vowels: "+ vowels);
		System.out.println("Consonants: "+ consonants);
		System.out.println("Numbers: "+ numbers);

	}

}
