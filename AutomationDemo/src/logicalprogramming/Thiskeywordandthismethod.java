package logicalprogramming;

public class Thiskeywordandthismethod {
	int a = 20;
	void thiskeyword(){
		int a = 10;
		System.out.println("This is Local variable: "+ a);
		System.out.println("This is instance variable or non static global variable: "+ this.a); //this is a keyword to identify the instance variable when the local and instance variable is name.
		// this keyword is only used for instance variable...
	}
	
	Thiskeywordandthismethod(double a) {
	     
	     this(2);
		System.out.println("Double parameterize constructor: "+ a);
	}
   
	Thiskeywordandthismethod(int b){
		this();
		System.out.println("Integer parameterize constructor: "+ b);
	}
	
	Thiskeywordandthismethod(){
	   this("String c");
		System.out.println("Hello Ranjith" );
	}
	
	Thiskeywordandthismethod(String c){
		
		System.out.println("No argument constructor" );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Thiskeywordandthismethod Object = new Thiskeywordandthismethod(2.3);
          Thiskeywordandthismethod thiskeyword = new Thiskeywordandthismethod();
          thiskeyword.thiskeyword();
	}

}
