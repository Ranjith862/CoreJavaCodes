package arrays;
import java.util.Arrays;

public class Singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1st way to create array with object.
		   int[] x = new int[3];
		   x[0] = 10;
		   x[1] = 20;
		   x[2] = 30;
		   
		   2nd way to create array.
		   int[] x = new int[] {10,20,30};
		   
		   3rd way to create array with array class:
		   int[] x = {10,20,30};
		      */
		//withtostring();
		//forloopmethod();
		foreachloopmethod();

	}
	
	static void withtostring() {
		int[] students = {10,20,30,40};
		System.out.println("with toString method: "+ Arrays.toString(students));
	}
	
	static void forloopmethod() {
		System.out.println("This is for loop method for printing: ");
		int[] students = {10,20,30,40};
		for(int i = 0; i < students.length;i++) {
			System.out.println(students[i]);
	}
	}
	static void foreachloopmethod() {
		System.out.println("This is for each loop method for printing: ");
		int[] students = {10,20,30,40};
		for(int studentscount : students) {
			System.out.println(studentscount);
			}
		
		

	}

}
