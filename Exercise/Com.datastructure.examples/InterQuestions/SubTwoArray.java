package InterQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubTwoArray {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("abcd");
		StringBuilder b=new StringBuilder("abcd");
	//	String b="abcd";
		if(a==b){
			System.out.println("abcd");
		}else{
			System.out.println("sdfhsdgfhj");
		}
		/*
		char[] arrayA = new char[] {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] arrayB = new char[] {'a', 'd', 'e'};
		Character[] objarrayA = ArrayUtils.toObject(arrayA);
		Character[] objarrayB = ArrayUtils.toObject(arrayB);
		Set<Character> setA = new HashSet(Arrays.asList(objarrayA));
		Set<Character> setB = new HashSet(Arrays.asList(objarrayB));

		setA.removeAll(setB);
		Integer[] array1 = ArrayUtils.toObject(arrayA);
		
		//Then, to get it back to a char array:

			Character[] result;
			result = setA.toArray(result);
			char[] cresult = ArrayUtils.toPrimitive(result);

	*/}

}
