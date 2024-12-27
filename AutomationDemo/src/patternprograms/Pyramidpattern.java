package patternprograms;

public class Pyramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // pyramid(5);
           reversepyramid(5);
	}
	
	static void pyramid(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void reversepyramid(int a) {
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=(a-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
