package inheritance;

interface a{ 
	void today();
}

interface b{ 
	void today();
}

public class Multiple_inheritance implements a,b {
	// Multiple inheritance can achieve by interface only.
	// When we give implements keyword > We give public keyword before Child method.
	// Its method overriding > Method name and parameter is same and business logic is one. 
	// Business logic writes only inside child class.
	public void today() {
		System.out.println("Today is Thursday.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Multiple_inheritance M = new Multiple_inheritance();
        M.today();
	}

}
