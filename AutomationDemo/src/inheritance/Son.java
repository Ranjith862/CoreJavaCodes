package inheritance;

class Father{  //Single level inheritance;
	void house() {
		System.out.println("Father : I have own house...");
	}
}

public class Son extends Father {
	void bmwCar() {
		System.out.println("Son : I have BMW Car...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Son a = new Son(); // I create a object for Son so, I can acqure both father and son class. One father and one son.
       a.house(); //Father class method..
       a.bmwCar(); //Son class method..
	}

}
