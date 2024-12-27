package constructors;

public class Constructors {
	
	int x = 20;
	void Thiskeyword() {
		int x = 10;
		System.out.println("Local variable x: "+ x);
		System.out.println("Global variable x: "+ this.x); // this keyword is used for non static properties only
 		                                                                          // this keyword is used if local and non static global variable is same variable. 
	}
	
	int b;
	Constructors(int c){ //parameterize constructors
		b = c;
		System.out.println("c value is: "+ c);
	}
	
	int a;
	Constructors(){  // No argument constructors
		a = 10;
		System.out.println("No argument constructors : "+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Constructors z = new Constructors(20);
		System.out.println("b value is: "+ z.b);
		
		Constructors y = new Constructors(210);
		System.out.println("b value is: "+ z.b); */
		Constructors s = new Constructors();
		s.Thiskeyword();
		

	}

}
