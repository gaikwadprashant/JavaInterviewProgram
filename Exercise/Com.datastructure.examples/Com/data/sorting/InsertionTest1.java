package Com.data.sorting;

public class InsertionTest1 {

	public static char[] chArr = { 'g', 'r', 'e', 'd', 'y', 'o', 'j', 'k' };

	public static void insertionSort(char[] chArr) {
		int len = chArr.length;
		for (int i = 1; i < len; i++) {
			char curr = chArr[i];
			int curPos = i;
			{
				//Ascending order
				while (curPos > 0 && chArr[curPos - 1] > curr) {
					chArr[curPos] = chArr[curPos - 1];
					curPos--;
				}
				//Descending order
				/*while (curPos > 0 && chArr[curPos - 1] < curr) {
					chArr[curPos] = chArr[curPos - 1];
					curPos--;
				}*/
				chArr[curPos] = curr;
			}

			for (int x = 0; x < chArr.length; x++) {

				System.out.print(chArr[x] + ", ");

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		InsertionTest1.insertionSort(chArr);
	}

}
