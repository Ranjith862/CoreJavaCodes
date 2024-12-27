package arraysprograms;

public class Findthemissingnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6,7};
		int sum1 = 0;
		int sum2 = 0;
		int missing = 0;
		
		for(int i = 0; i < a.length; i++) { // add sum of the elements in array.
			sum1 = sum1 + a[i];
		}
		for(int i = 1; i <= 7;i++) { // add sum of the elements of max number in array.i = 1 - min ; i <= 7 - max;
			sum2 = sum2 + i;
		}
		
		missing = sum2 - sum1;
		System.out.println(missing+" ");

	}

}
