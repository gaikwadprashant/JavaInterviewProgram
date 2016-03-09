package Com.data.sorting;

public class InsertionTestInteger {

	public static void main(String args[]) {

		int[] intArray = {0,2,3,1};
		int counter = 0;
		for (int i = 1; i < intArray.length; i++) {

			int curr = intArray[i];
			int currPosition = i;
			int temp = 0;
			{
				while (currPosition > 0 && intArray[currPosition - 1] > intArray[i]) {
					temp = intArray[currPosition - 1];
					intArray[currPosition - 1] = intArray[currPosition];
					intArray[currPosition] = temp;
					currPosition--;
					counter++;
				}
				intArray[currPosition] = curr;
			}
			
			
			
		}
		for(int y=0; y < intArray.length;y++){
			System.out.println("Step number "+counter);
			System.out.println("Elemnts are  :- "+intArray[y]);
			//counter++;
		}
		System.out.println("");
	}
}
