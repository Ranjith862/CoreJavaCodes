package arraysprograms;

public class Findevenoroddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		String even = "";
		String odd = "";
		
		for(int a : x) {
			if(a % 2 == 0) {
				even = even + a + " ";
			}
			else {
				odd = odd + a + " ";
			}
			
		}
		
		System.out.println("Even numbers are: "+ even);
		System.out.println("Odd numbers are: "+ odd);
	}

	}


