package Interviewsamples;

public class IndexInArray {

	public static void main(String[] args) {

		int[] intArray = { 34, 2, 56, 98, 23 };
		int largest = intArray[0];
	//	int smallest = intArray[0];
		int index = 0;

		for (int i = 0; i < intArray.length; i++) {

			if(intArray[i]>=largest){
				largest = intArray[i];
				index = i;
			}
		}
		System.out.println("Largest is "+largest +"  and Index of it is "+index);
	}
}
