package InterQuestions;

import java.util.Random;

public class Contest {

	private static int ticket_300Count = 0;
	private static int ticket_500Count = 0;
	private static int ticket_700Count = 0;
	private static int ticket_1000Count = 0;
	private static int[] priceBracket = { 300, 500, 700, 1000 };
	private static int totalCount = 50;
	private static int tickets_Booked = 0;

	void initialize() {

	}

	boolean book(int price, int days) {
		if (ticket_1000Count <= totalCount && (days > 1 && days <= 90)) {
			--totalCount;
			ticket_1000Count++;
			return true;
		}

		if (ticket_700Count <= totalCount && (days > 1 && days <= 90)) {
			--totalCount;
			ticket_700Count++;
			return true;
		}
		if (ticket_500Count <= totalCount && (days > 1 && days <= 90)) {
			--totalCount;
			ticket_500Count++;
			return true;
		}
		if (ticket_300Count <= totalCount && (days > 1 && days <= 90)) {
			--totalCount;
			ticket_300Count++;
			return true;
		}
		if (totalCount == tickets_Booked) {
			return false;
		}
		return true;
	}

	public static void main(
			String[] args) {/*
							 * Contest contest = new Contest(); for(int i=0; i
							 * <50; i++){ Random generator = new Random(); int
							 * randomIndex =
							 * generator.nextInt(priceBracket.length);
							 * contest.book(randomIndex, 90); }
							 * System.out.println("Total ticket count is "
							 * +totalCount); System.out.println(
							 * "1000 ticket count "+ticket_1000Count);
							 * System.out.println("700 ticket count "
							 * +ticket_700Count); System.out.println(
							 * "500 ticket count "+ticket_500Count);
							 * System.out.println("300 ticket count "
							 * +ticket_300Count);
							 * 
							 */

		int array[] = { 2, 4, 5, 8, 12, 23, 45, 56, 68, 98, 122 };
		int leftEnd = 0;
		int rightEnd = array.length - 1;
		int middle = (leftEnd + rightEnd) / 2;
		
		int target = 98;

		while (leftEnd <= rightEnd) {
			if (target == array[middle]) {
				System.out.println("Element found at " + middle);
				break;
			} else if (array[middle] > target) {
				leftEnd = leftEnd + 1;
				if(array[leftEnd] == target){
					System.out.println("ELement found at "+leftEnd);
					break;
				}
				
			} else if (array[middle] < target) {
				rightEnd = rightEnd - 1;
				if(array[rightEnd] == target){
					System.out.println("ELement found at "+rightEnd);
					break;
				}
			}
		}
		
	}

}
