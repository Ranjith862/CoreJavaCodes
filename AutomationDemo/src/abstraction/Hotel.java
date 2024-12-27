package abstraction;

interface Customers{ // Interface - when we only have abstract method we write interface keyword before class name.
	int x = 10;
	int y = 20;
	void pongal();
	void idly();
}

public class Hotel implements Customers{ // implements keyword - is used for interface to conncect child normal class  and parent interface class.
	
	public void pongal() { //for interface class > inside abstract methods > we put public for when we create concrete method for abstract method.
		System.out.println("Pongal bought by " + x + " persons.");
	}
	
	public void idly() {
	   System.out.println("Idly bought by " + y + " persons.");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(x); // We can directly print the interface variables because its static, public and final in default.
       Hotel hotel = new Hotel();
       hotel.pongal();
       hotel.idly();
	}

}
