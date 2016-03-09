package Colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);	list.add(2);		list.add(3);		list.add(4);
		list.add(5);	list.add(6);		list.add(7);		list.add(8);
		list.add(9);	list.add(10);
		System.out.println("List before changes "+list);
		for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();){
			int temp= iterator.next();
			if(temp%2!=0){
				iterator.remove();
			}
			
		}
		
		Collections.sort(list);
		System.out.println("After changes "+list);

	}

}
