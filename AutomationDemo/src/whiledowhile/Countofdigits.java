package whiledowhile;

public class Countofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 44556;
		int count = 0;
		while(number >0)
		{
			int remaindar = number % 10; // Used to remove the last digit of the number.
			count++;
			number = number / 10; // Used to remove the last digit from the number.
			
		}
		System.out.println(count);

	}

}
