package inheritance;

class Dad{ // Multi level inheritance
	void land() {
		System.out.println("Father: I have 5acr land.");
	}
}

class Ranjith extends Dad{
	void bmw() {
		System.out.println("Son: I have BMW Car.");
	}
}

public class Grandson extends Ranjith {
    
	void money() {
		System.out.println("Grandson: I have money.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Grandson a = new Grandson(); // 2 Parents and 2 Childrens
       a.land();
       a.bmw();
       a.money();
	}

}
