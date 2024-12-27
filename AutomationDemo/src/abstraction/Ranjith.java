package abstraction;

abstract class Father{ //Absrtact class - When there is one abstract method.. the class is also called abstract class.
	void land() 
	{
		System.out.println("20 acers of Land");		
	}
	abstract void emi();
}

public class Ranjith extends Father {
	void car() 
	{
		System.out.println("I have Rolls Royals Car");
	}
	
    void emi()
    {
		System.out.println("I paid emi");
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Ranjith responsible = new Ranjith();
           responsible.land();
           responsible.car();
           responsible.emi();
	}

}
