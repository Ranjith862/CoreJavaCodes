package polymorphism;

//Its Method Overriding - Methods and parameters are same in parent and child class 
//but business logic is different. Here we use inheritance concept.
class Mother {
	void kitchen() {
		System.out.println("Idly");
	}
}

public class Runtimepoly extends Mother {
	void kitchen() {
		super.kitchen(); // super keyword is used to define parant class or super class.
		System.out.println("Maggie");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtimepoly b = new Runtimepoly();
		b.kitchen();

	}

}
