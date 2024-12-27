package logicalprogramming;

public class Factorialseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //factorialseries();
		    factorsnumber();

	}
	
    public static void factorialseries() {
		//5*4*3*2* = 120;
		int n = 5;
		int factorial = 1;
		for(int i = 1; i<= n; i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
    }
    
    public static void factorsnumber() {
    	int num = 6;
    	for(int i = 1; i <= num;i++) {
    		if(num%i ==0) {
    			System.out.println(i);
    		}
    	}
    }
  
  
}
