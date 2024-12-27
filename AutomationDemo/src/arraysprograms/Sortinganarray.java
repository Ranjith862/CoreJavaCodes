package arraysprograms;

import java.util.Arrays;

public class Sortinganarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] x = {1,2,3,4,5,10,3,6};
		for(int i = 0; i< x.length;i++) {
			for(int j = i+1; j < x.length;j++) {
				if(x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
	
		}
		System.out.println(Arrays.toString(x));
		System.out.println("Second Largest Value: " + x[x.length - 2]); 

	}

}
