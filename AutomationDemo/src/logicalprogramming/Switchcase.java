package logicalprogramming;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     switchcasewithinteger(5);
     switchcasewithstring("BB Season 6");
     switchcasewithenumclass();
	}
	
	enum Color{
		Red,Blue,Orange,White;
	}
	
	static void switchcasewithenumclass() {
		Color myfavcolor = Color.White;
		switch(myfavcolor) {
		case Red: System.out.println("My Fav color is " + myfavcolor );
		break;
		case Blue: System.out.println("My Fav color is " + myfavcolor );
		break;
		case Orange: System.out.println("My Fav color is " + myfavcolor );
		break;
		case White: System.out.println("My Fav color is " + myfavcolor );
		break;
		}
	}
	
	static void switchcasewithstring(String Biggbosstamil) {
		switch(Biggbosstamil) {
		case "BB Season 1": System.out.println("Title winner - Arav");
		break;
		case "BB Season 2": System.out.println("Title winner - Riythvika Panneerselvam");
		break;
		case "BB Season 3": System.out.println("Title winner - Mugan Roae");
		break;
		case "BB Season 4": System.out.println("Title winner - Aari Arjunan");
		break;
		case "BB Season 5": System.out.println("Title winner - Raju");
		break;
		case "BB Season 6": System.out.println("Title winner - Mohammad Azeem");
		break;
		case "BB Season 7": System.out.println("Title winner - Vj Archana");
		break;
		case "BB Season 8": System.out.println("Is ongoing..");
		break;
		default: System.out.println("Invalid season name");

		}
	}
	
	static void switchcasewithinteger(int Today) {
		switch(Today) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Invalid Day");
		}
	}

}
