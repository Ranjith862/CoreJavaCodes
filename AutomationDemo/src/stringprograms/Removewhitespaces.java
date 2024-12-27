package stringprograms;

public class Removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " Hello    W  orld I m Ran ji t   h";
		String b = a.replaceAll("\\s", "");
		System.out.println(b);
	}

}
