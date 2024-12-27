package stringprograms;

public class Sortingofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ranjith";
		char[] b = a.toCharArray();
		for(int i =0; i < b.length ; i++) {
			for(int j = i+1; j < b.length ; j++) {
				if(b[i] > b[j]) {
				char temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
			}
		}
		for(char c : b) {
			System.out.print(c);
		}

	}

}
