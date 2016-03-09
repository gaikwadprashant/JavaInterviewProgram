package prashantJavaExercise;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String str = "sdf df fg fg tr ty ty yu yui i yu ui ui ui uirt rt ty ty rt dg erew rt dfg 5t wer ewrew ert rt erter y5 wer 34 4trt y y rt er rt er 45 ty yu yu yu yu yu yu"
				+ "sd";
		String[] strArray = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String string : strArray){
			
			Integer count = map.get(string);
			
			if(count == null){
				map.put(string, 1);
			}
			else{
				map.put(string, count+1);
			}
			
		}
		
		System.out.println("Count of string "+map);

	}

}
