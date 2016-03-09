package Colletion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTopper {

	List<String> list = new ArrayList<String>();


	 Map<String,Integer> findTopperInEachSub(List<String> list) {
		Map<String, Integer> mapObj = new HashMap<String, Integer>();
		
		for(String string : list){
			String[] stringArray = string.split("\\|");
			
			String subject = stringArray[1].trim();
			Integer marks =Integer.parseInt(stringArray[2].trim());
			Integer value = mapObj.get(subject);
			if(value == null || (value<marks)){
				mapObj.put(subject, marks);
			}
		}
		return mapObj;
		
	}
	
	public static void main(String[] args) {
		FindTopper topper = new FindTopper();
		
		topper.list.add("23 | Data Structure | 8856");
		topper.list.add("24|English | 7756");
		topper.list.add("34|Data Structure | 5566");
		topper.list.add("36|Data Structure | 5506");
		topper.list.add("56|English | 4556");
		topper.list.add("55|Data Structure | 4556");
		topper.list.add("35|Data Structure | 4345");
		topper.list.add("20|English | 67691");
		topper.list.add("27|English | 778");
		topper.list.add("305|Economics | 7777");
		topper.list.add("20|Economics | 67691");
		
		Map<String, Integer> mapObj = topper.findTopperInEachSub(topper.list);
		System.out.println("Final score is "+mapObj);
	}


}
