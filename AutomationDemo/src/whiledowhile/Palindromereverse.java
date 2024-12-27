package whiledowhile;

public class Palindromereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeinteger(121);
		
      
	}
	
	static void palindromeinteger(int number) {
		int temp = number;
		int reverse = 0;
		while(number > 0)
		{
			int remaindar = number % 10;
			reverse = (reverse*10) + remaindar;
			number = number / 10;
		}
		
		if(temp == reverse) {
			System.out.println(temp + " This is a palindrome number");
		}
		else {
			System.out.println(temp + " This is not a palindrome number");
		}
	}

}
