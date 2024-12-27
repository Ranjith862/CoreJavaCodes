package inheritance;

class Appa{ // Hierarchical level inheritance 
	void ownHouse() {
		System.out.println("Appa: I have own house.");
	}
}

class Brother1 extends Appa{
	void job() {
		System.out.println("Brother1: Im a Automation test engineer.");
	}
}

public class Brother2 extends Appa{
	void studying() {
		System.out.println("Brother2: Im studying Bcom 2nd year.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Brother1 Ranjith = new Brother1();  //Here want to create 2 objects 1 Parent and 2 sons.
         Brother2 Santhosh = new Brother2(); 
         Ranjith.ownHouse();
         Ranjith.job();
         Santhosh.ownHouse();
         Santhosh.studying();
	}

}
