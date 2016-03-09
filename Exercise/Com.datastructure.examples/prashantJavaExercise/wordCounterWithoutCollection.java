package prashantJavaExercise;

public class wordCounterWithoutCollection {

	public static void main(String[] args) {

		countWords("apple banna apple fruit fruit apple hello hi hi hello hi");

	}

	static void countWords(String st) {
		// split text to array of words
		String[] words = st.split("\\s");
		// frequency array
		int[] fr = new int[words.length];
		// init frequency array
		for (int i = 0; i < fr.length; i++)
			fr[i] = 0;
		// count words frequency
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					fr[i]++;

				}
			}
		}

		// clean duplicates
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					if (i != j)
						words[i] = "";

				}
			}
		}

		// show the output

		int total = 0;
		System.out.println("Duplicate words:");
		for (int i = 0; i < words.length; i++) {

			if (words[i] != "") {

				System.out.println(words[i] + "=" + fr[i]);

				total += fr[i];

			}

		}
		System.out.println("Total words counted: " + total);
	}

}
