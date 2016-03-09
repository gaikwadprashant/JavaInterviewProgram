package Colletion;

import java.util.Arrays;

public class MyArrayListImpl<E> {
	
	private int size=0;
	private static final int DEFAULT_CAPACITY =10;
	private Object[] elements;
	
	public MyArrayListImpl(){
		elements = new Object[DEFAULT_CAPACITY];
	}

	public void addElements(E str){
		
		System.out.println("Execution of add elements method started");
		if(size == elements.length){
			ensureCapacity();
		}
		elements[size++]=str;
		
	}

	private void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);	
	}
	
	public E get(int i){
		
		System.out.println("Execution of Get method started");
		if(i >= size || i < 0){
			throw new ArrayIndexOutOfBoundsException("Index i is " + i + ", Size is  "+size);
		}
		return (E) elements[i];
	}
	
	public static void main(String args[]){
		
		System.out.println("Execution of main method started");
		MyArrayListImpl<Integer> arrayList = new MyArrayListImpl<Integer>();
		
		arrayList.addElements(2);
		arrayList.addElements(45);
		arrayList.addElements(56);
		arrayList.addElements(100);
		arrayList.addElements(234);
		arrayList.addElements(434345);
		arrayList.addElements(53436);
		arrayList.addElements(1400);
		arrayList.addElements(342);
		arrayList.addElements(3445);
		arrayList.addElements(3456);
		arrayList.addElements(34100);
		
		arrayList.get(2);
			
		arrayList.get(16);
		System.out.println("Execution of main method ended");
	}
}
    