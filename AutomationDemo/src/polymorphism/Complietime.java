package polymorphism;

public class Complietime { //Its for Method Overloading - Methods are same but parameters different.
	
	void a() {
		System.out.println("Im Ranjith");
	}
   
	void a(int a) {
		System.out.println("This is int method: "+ a);
	}
	
	void a(String a) {
		System.out.println("This is string method: "+ a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complietime obj = new Complietime();
		obj.a();
		obj.a(5);
		obj.a("Hello world");

	}

}
