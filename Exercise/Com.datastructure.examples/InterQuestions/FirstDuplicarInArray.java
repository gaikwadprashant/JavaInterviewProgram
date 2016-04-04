package InterQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicarInArray {

	public static void main(String[] args) {
		int [] a = {1,2,5,7,5,3,10,2};
		FirstDuplicarInArray f = new FirstDuplicarInArray();
		System.out.println("{1,2,5,7,5,3,10,2}");
		System.out.println("first repeated element by index is : " + f.findDupicate(a));

	}

	private int findDupicate(int[] a) {
		int index=-1;
		
		Set<Integer> hashSet = new HashSet<Integer>();
		for(int i=a.length-1; i>=0; i--){
			if(hashSet.contains(a[i])){
				index=i;
			} else{
				hashSet.add(a[i]);
			}
		}
		return index;
	}

}
