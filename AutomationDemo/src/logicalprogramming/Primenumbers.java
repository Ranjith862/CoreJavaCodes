package logicalprogramming;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method 
       int number = 100;
       
       for(int i = 1;i <= number;i++) {
    	      	   int count = 0;
      for(int j=1;j<= i;j++) {
    	   if(i%j == 0) {
    		   count = count + 1;
    	   }
    	  
        }
        if(count == 2) {
		    System.out.print(i + " ");
	      }
        }

	}

}
