package prashantJavaExercise;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		String str = "gasda edrt asd2 34f fgd gasda 345 43dr fgd tytr yrt ygf d3254g gasda dfg 3dff yrtr fgd tyrt ytry dfg gasda";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	   // Set<Character, Integer> charMap = new Hashset<Character , Integer>();
	    char[] arr = str.toCharArray();

	    for (char value: arr) {

	       if (Character.isAlphabetic(value)) {
	           if (charMap.containsKey(value)) {
	               charMap.put(value, charMap.get(value) + 1);

	           } else {
	               charMap.put(value, 1);
	           }
	       }
	    }

	    System.out.println(charMap);


	}

}
