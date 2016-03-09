package Interviewsamples;

public class SecondLargest {

	public static void main(String[] args) {

		int[] numbers = {3, 5,4,12,6,45, 23, 54,8,90,52};
		int smallest = numbers[0];
		int secSmallest= numbers[0];

		for(int n:numbers){
			
			if(n < smallest){
				secSmallest = smallest;
				smallest = n;
			} else if(n < secSmallest){
				secSmallest = n;
			}
			
		}
		System.out.println("Smallest number is "+smallest +" and Second smallest is "+secSmallest);
	}

}
