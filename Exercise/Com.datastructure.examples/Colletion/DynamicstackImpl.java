package Colletion;

import java.io.Console;
import java.util.Scanner;

public class DynamicstackImpl {

	private int stackSize;
	private int[] stackArr;
	private int topOfStack;

	public DynamicstackImpl(int stackSize) {
		this.stackSize = stackSize;
		this.stackArr = new int[stackSize];
		this.topOfStack = -1;
	}

	/**
	 * This method adds new entry to the top of the stack
	 * 
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry) {
		if (this.isStackFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
			this.increaseStackCapacity();
		}
		System.out.println("Adding: " + entry);
		this.stackArr[++topOfStack] = entry;
	}

	/**
	 * This method removes an entry from the top of the stack.
	 * 
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[topOfStack--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}

	private void increaseStackCapacity() {

		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.stackSize = this.stackSize * 2;
	}

	/**
	 * This method returns true if the stack is empty
	 * 
	 * @return
	 */
	public boolean isStackEmpty() {
		return (topOfStack == -1);
	}

	/**
	 * This method returns true if the stack is full
	 * 
	 * @return
	 */
	public boolean isStackFull() {
		return (topOfStack == stackSize - 1);
	}

	public static void main(String[] args) {
        DynamicstackImpl stack = new DynamicstackImpl(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }

}
