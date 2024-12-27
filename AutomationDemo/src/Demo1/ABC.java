package Demo1;

public class ABC {

	// Non Static Properties:

	String Bike = "Royal Enfield"; // Non Static Variable

	void BikeColor() // Non static Method
	{
		String Color = "Black";
		System.out.println("My Bike Color is " + Color);
	}

	public static void main(String[] args) {

		ABC Object = new ABC(); // Create an Object for Class
		System.out.println("My Bike name is " + Object.Bike); // Print the Variable
		Object.BikeColor(); // Call the method

	}

}
