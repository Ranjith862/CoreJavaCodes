package strings;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method 
       //StringBuffer:
		System.out.println("StringBuffer: ");
		StringBuffer a = new StringBuffer("Hello");
		a.append(" World");
		System.out.println(a);
       //StringBuilder:
		System.out.println("StringBuilder: ");
		StringBuilder b = new StringBuilder("Raw");
		b.append(" Materials");
		System.out.println(b);
	}

}
