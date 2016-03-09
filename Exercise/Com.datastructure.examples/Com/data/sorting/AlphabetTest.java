package Com.data.sorting;

public class AlphabetTest {

	public static void main(String[] args) {

		String str = "adfgkjdkfg";
		char[] charA = str.toCharArray();
		int counter = 0;
		for (char ch : charA) {
			System.out.println("");
			counter++;
		}
		System.out.println("String length is " + counter);
		char ch;
		for (ch = 'A'; ch <= 'Z'; ch++)
			System.out.println(ch);
	}

}
