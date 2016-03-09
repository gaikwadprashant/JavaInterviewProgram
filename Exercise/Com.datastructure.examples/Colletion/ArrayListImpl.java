package Colletion;

import java.util.Arrays;

public class ArrayListImpl<E> {
	
	private int size=0;
	private int DEFAULT_SIZE = 10;
	private Object elements[];
	
	public ArrayListImpl(){
		elements =  new Object[DEFAULT_SIZE];
	}

	public void add(E e){
		System.out.println("Add methos started");
		if(size == elements.length){
			ensureCapacity();
		}
		
		elements[size++]=e;
		System.out.println("Add methos ended");
	}
	
	private void ensureCapacity(){
		int updatedSize = elements.length*2;
		elements = Arrays.copyOf(elements, updatedSize);
	}
	
	public E get(int i){
		if(i > size || i <0 ){
			throw new ArrayIndexOutOfBoundsException("index is : "+ i+ ", size is "+size);
		}
		
		return (E)elements[i];
	}
	
	public static void main(String[] args) {
		ArrayListImpl<String> list = new ArrayListImpl<String>();
		list.add("ads");
		list.add("dgdf");
		list.add("dgfgfgfhfg");
		list.add("fggf");
		list.add("afghfgds");
		list.add("ghgbvads");
		list.add("gfgbgbads");
		list.add("fggfbgads");
		list.add("gfgfgads");
		list.add("prashant");
		list.add("jaan");
		list.add("bhai");
		System.out.println("List size "+ list.size);
		list.get(-2);
		
		for(int i=0; i < list.size;i++){
			System.out.println("Elements in Array are "+list.get(i));
		}
	}

}
