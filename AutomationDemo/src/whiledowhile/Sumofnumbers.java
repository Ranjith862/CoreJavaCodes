package whiledowhile;

public class Sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4562;
       int  sum = 0;
        while(number > 0)
        {
        	int remaindar = number % 10;
        	sum = sum + remaindar;
        	number = number / 10;
        	
        }
        System.out.println(sum);
	}

}
