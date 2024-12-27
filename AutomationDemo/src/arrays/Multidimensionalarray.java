package arrays;

import java.util.Arrays;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multidimensinalwithforloop();
		multiwthforeach();
        multiwithtostring(); 
        // Multidimensional array means rows and colum size range is same.
	}
	
	static void multidimensinalwithforloop() {
		char[][] grade = {{'a','b','c'},{'d','e','f'}};
		for(int i = 0; i < grade.length; i++) {
			for (int j =0; j<grade[i].length;j++) {
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void multiwthforeach() {
		int[][] a = {{1,2,3,5},{55,66,433,45}};
		for(int[] b:a) {
			for(int c:b) {
			System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
	static void multiwithtostring() {
		int[][] a = {{1,2,3,5},{55,66,433,45}};
        System.out.println(Arrays.deepToString(a)); // deeptostring should be mention for multi or jagged arrays.
	}

}
