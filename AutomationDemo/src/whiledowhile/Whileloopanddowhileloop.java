package whiledowhile;

public class Whileloopanddowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileloop();
		dowhileloop();

	}
	
	static void whileloop() {
		//whileloop syntax;
		System.out.println("While loop");
		int i = 1;
		while(i <= 10) {
		   System.out.print(i + " ");
		   i++;
		}
	}
	
	static void dowhileloop() {
		System.out.println(" ");
		System.out.println("Do While loop");
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}
		while(i <= 10);
	}

}
