package stringprograms;

public class Swappingtwostrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a = a+b; //swapping formula without temp.
		// b = a-b;
		// a = a-b; 
		String a = "Ram";
		String b = "Raj";
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring( b.length());
		System.out.println("A value: "+ a);
		System.out.println("B value: "+ b);	

	}

}
