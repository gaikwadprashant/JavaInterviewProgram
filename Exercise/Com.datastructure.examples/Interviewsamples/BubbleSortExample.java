package Interviewsamples;

public class BubbleSortExample {
	public static void main(String args[]) {

		int[] intArray = { 3, 7, 2, 10, 1, 4, 9 };

		for (int i = intArray.length; i >= 0; i--) {

			for (int j = 0; j < intArray.length - 1; j++) {

				int k = j + 1;

				if (intArray[j] > intArray[k]) {

					int temp;
					temp = intArray[j];
					intArray[j] = intArray[k];
					intArray[k] = temp;

				}
			}

			for (int x = 0; x < intArray.length; x++) {

				System.out.print(intArray[x] + ", ");

			}

			System.out.println();
		}

	}
}
