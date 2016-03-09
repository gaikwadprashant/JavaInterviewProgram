package prashantJavaExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapOrderByValue {

	public static void main(String args[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Prashant gaikwad", 4545);
		map.put("prashant gaikwad", 5675);
		map.put("rashant Gaikwad", 4545675);
		map.put("Prashant Gaikwad", 4567645);
		map.put("fghfgh gafghfhffgikwad", 45567645);
		map.put("fghfhfgh fghfghfg fhfdfd", 455645);
		map.put("tyutyutyutyd", 4564545);

		Set<Entry<String, Integer>> setvalues = map.entrySet();

		List<Entry<String, Integer>> listValues = new ArrayList<Entry<String, Integer>>(setvalues);

		Collections.sort(listValues,
				new Comparator<Map.Entry<String, Integer>>() {

					public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2) {
						//return (o2.getValue()).compareTo(o1.getValue());
						return (o2.getKey()).compareTo(o1.getKey());
					}

				});
		for (Map.Entry<String, Integer> entry : listValues) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}

	}

}
