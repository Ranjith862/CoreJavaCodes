package logicalprogramming;


public class Jumpingsatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		continuestatement();
		breakstatement();

	}
	
	static void continuestatement() {
		System.out.println("This is continue statement : ");
		for(int i = 1; i <= 10;i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();

	}
	
	static void breakstatement() {
		System.out.println(" ");
		System.out.println("This is break statement : ");
        
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i);
		}
		System.out.println();

	}

}
