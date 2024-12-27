package logicalprogramming;

public class Fibnocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0;
		int second = 1;
		System.out.print(first + " ");
		System.out.print(second + " ");
		for(int i = 1;i<=10;i++) {
			int sum = first + second;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		}

	}

}
