package stringprograms;

public class Reverseeachandeverywordinsentance {

	public static void main(String[] args) {
		// TODO Auto-generated method 
          String a = "Hello world, Im Ranjith" ;
          String[] b = a.split(" ");
          String result = " ";
          for(String c : b) {
              String reverse =" ";

          for(int i = c.length() - 1;i >= 0; i--) {
        	  reverse = reverse + c.charAt(i); 
          }
          result = result + reverse ;
          
          }
         
          System.out.println(result.trim());
          

	}

}
