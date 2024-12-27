package logicalprogramming;

public class Checkbignumwith3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 254;
		int second = 340;
		int third = 338;
		
		if((first > second) && (first > third)) {
			System.out.println(first + " is bigger number");
		}
		else if((second > first) && (second > third)) {
			System.out.println(second + " is bigger number");
		}
		else {
			System.out.println(third + " is bigger number");
		}
	}

}
