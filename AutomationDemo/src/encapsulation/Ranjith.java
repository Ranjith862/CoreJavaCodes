package encapsulation;

class Ram{ //without this keyword...
	private int salary; // Private keyword - is used to secure data's. It can only access to inside the same class. If we want to access on other class means we use setter and getter method.
	public void setsalary(int mysal) { // Set Method
        salary = mysal; 
	}
	
    public int getsalary() { // Get Method to access private variable in another class.
       return salary;
    }
}

class Ranjithsalary{ // with this keyword..
	private int ransalary;
	public void setransalary(int ransalary) {
		this.ransalary = ransalary;
	}
	public int getransalary() {
		return ransalary;
	}
	
}

class Rajsalary{ // with this keyword..
	private int rajsalary;
	public void setrajsalary(int rajsalary) {
		this.rajsalary = rajsalary;
	}
	public int getrajsalary() {
		return rajsalary;
	}
}
public class Ranjith {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram r = new Ram();
		r.setsalary(10000);
		int salaryinfo = r.getsalary();  //we store the get method. Get method has return keyword so we can't directly call so we store it in one variable and print.
		System.out.println("Ram monthly salary is: "+ salaryinfo);
		
        Ranjithsalary ran = new Ranjithsalary();
        ran.setransalary(30000);
        int ranjithsalaryinfo = ran.getransalary(); //store the get method into int variable.
        System.out.println("Ranjith monthly salary is: "+ranjithsalaryinfo);

        Rajsalary raj = new Rajsalary();
        raj.setrajsalary(15000);
        int rajsalaryinfo = raj.getrajsalary(); // store gerajsalary method into rajsalaryinfo variable.
        System.out.println("Raj mothly salary is: "+ rajsalaryinfo);
        		
	}

}
