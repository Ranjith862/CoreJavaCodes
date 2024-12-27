package arraysprograms;

public class Separatepositiveandneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {-1,-2,-5,-59,34,5,21,35};
		String positive = "";
		String negative = "";
		for(int y : x) {
			if(y > 0) {
			positive = positive + y + " ";
			}
			else {
				negative = negative + y + " ";
			}
		}
		
		System.out.println("Positive numbers are: " + positive);
		System.out.println("Negative numbers are: "+ negative);

	}
	
	
}
