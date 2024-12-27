package patternprograms;

public class Lefttriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        leftreversetriangle(5);
	}
	
	
	static void leftTriangle(int n) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void leftreversetriangle(int n) {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
