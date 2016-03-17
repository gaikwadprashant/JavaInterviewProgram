package Colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
				
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
		{
			System.out.println("Elements in list "+itr.next());
			//System.out.println("Elements in list "+itr.remove());
				itr.remove();
			//list.add("new element added");
			System.out.println("Elements in list after adding "+list);
		}
			
	
	}

}
