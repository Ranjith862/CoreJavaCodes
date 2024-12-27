package arraysprograms;

import java.util.Arrays;

public class Mergetwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		int[] c = new int[a.length + b.length];
		for(int i =0; i < a.length; i++) {
			c[i] = a[i]; // copy the a arrays to c array.
		}
		for(int i =0; i < b.length; i++) {
			c[i + a.length] = b[i]; // This loop copies all elements from b into c, starting from where the array a ends (i + a.length).
		}
		//System.out.println(Arrays.toString(c));
		for(int d : c) {
			System.out.print(d + " ");
		}
      
	}

}
