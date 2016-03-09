package Colletion;

public class MyStackImpl {

	private int stackSize;
	private int[] stackArr;
	private int top;

	public MyStackImpl(int stackSize) {
		this.stackSize = stackSize;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	public void push(int element) throws Exception {

		if (this.isStackFull()) {
			System.out.println("Stack is full you can't add" + element
					+ " to Stack. Is is full");
		} 
		System.out.println("New " + element	+ " is added at the top of Stack");
			this.stackArr[++top] = element;
		
	}

	public int pop() throws Exception{
		if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: "+entry);
        return entry;
	}

	  public boolean isStackEmpty() {
	        return (top == -1);
	    }
	
		
	public boolean isStackFull() {
		return (top == stackSize - 1);

	}

	public static void main(String[] args) {
		MyStackImpl stack = new MyStackImpl(5);
		try {
			stack.push(4);
			stack.push(8);
			stack.push(3);
			stack.push(89);
			stack.pop();
			stack.push(34);
			stack.push(45);
			stack.push(78);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
