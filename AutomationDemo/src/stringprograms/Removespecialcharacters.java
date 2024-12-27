package stringprograms;

public class Removespecialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "user@123#";
		String b = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(b);
	}

}
