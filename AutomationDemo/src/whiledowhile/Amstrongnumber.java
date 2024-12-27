package whiledowhile;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		int amstrong = number;
		int sum = 0;
		while(number > 0)
		{
			int remaindar = number % 10;
			sum = sum + (remaindar*remaindar*remaindar);
			number = number / 10;
        }
		
		if(amstrong == sum)
		{
			System.out.println( amstrong + " Is Amstrong number");
		}
		else
		{
			System.out.println( amstrong + " Is not Amstrong number");
		}

	}

}
