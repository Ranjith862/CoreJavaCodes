package strings;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Ranjith";
		String b = "Ranjith";
		String c = "   Ranjith  ";
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("t"));
		System.out.println(a.lastIndexOf('t'));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace('j', 'z'));
		System.out.println(a.replaceAll("ith","jee"));
		System.out.println(a.startsWith("R"));
		System.out.println(a.endsWith("h"));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.contains("Ran"));
		System.out.println(c.trim()); //Trim the space
		System.out.println(a.substring(1));
		System.out.println(a.substring(3, 6)); // Inbetween index only print
		
		char[] d = a.toCharArray(); //String to character array converstion.
		System.out.println(Arrays.toString(d)); 
		
		String[] e = a.split("a"); 
		System.out.println(Arrays.toString(e));

	}

}
