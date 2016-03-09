package prashantJavaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {

	public static void main(String args[]){
		String str = "dgf dfg rrter gf fgh rt gt fg f h sd re dfg dfg df gf fg df";
		
		List<String> listValues = Arrays.asList(str.split(" "));
		
		Set<String> setVal = new HashSet<String>(listValues);
		
		for(String uniqueWord : setVal){
			System.out.println(uniqueWord + ": " + Collections.frequency(listValues, uniqueWord));
		}
	}
}
