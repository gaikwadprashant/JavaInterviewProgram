package InterQuestions;

public class MaximumSubArray {

	public static void main(String[] args) {
		int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
        MaximumSubArray i = new MaximumSubArray();
        System.out.println("Maximum subarray is  " + i.solve(arrA));
      

	}
	
	int solve(int[] a){
		//create a array of array a.length+1
		int [] solution = new int[a.length+1];
        solution[0] = 0;
        for(int i=1; i < solution.length; i++){
        	solution[i] = Math.max(solution[i-1]+a[i-1], 0);
        }
        //this will print the solution matrix
        //System.out.println(Arrays.toString(solution));
        //now return the maximum in the solution array
        int result = solution[0];
        for (int j = 1; j <solution.length ; j++) {
            if(result>solution[j])
                result = solution[j];
        }

        return result;
	}

}
