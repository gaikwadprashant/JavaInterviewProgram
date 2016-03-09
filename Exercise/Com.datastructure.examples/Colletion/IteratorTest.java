package Colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("qwwerreree");
		list.add("qwweewrerretertere");
		list.add("qertwe");
		list.add("qrtwe");
		list.add("tyqerwe");
		list.add("tyqwe");
				
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
		{
			System.out.println("Elements in list "+itr.next());
			//list.add("new element added");
			System.out.println("Elements in list after adding "+itr.next());
		}
			
	
	}

}
