package arraysprograms;

public class Findmaxandminnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,3,4,5,6,7};
		int max = x[0];
		int min = x[0];
		
		for(int y : x) {
			if(y > max) {
				max = y;
			}
			
		}
		for(int y : x) {
			if(y < min) {
				min = y;
			}
		}
		System.out.println("Minimium value: "+ min);
		System.out.println("Maximum value: "+max);

	}

}
