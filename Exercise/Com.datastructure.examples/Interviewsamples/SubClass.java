package Interviewsamples;



class SuperClass {

	SuperClass() {
		this(1);
		System.out.println("Super Class no-argument constructor");

	}

	SuperClass(int x) {

		this(1, "constructor chaining");
		System.out.println("Super class one -argument constructor(int)");

	}

	SuperClass(int x, String str) {
		System.out.println("Super class two-argument constructor(int, String)");
	}

}

class SubClass extends SuperClass {

	SubClass() {
		this(1);
		System.out.println("Sub Class no-argument constructor");

	}

	SubClass(int x) {

		this("Constructor chaining");
		System.out.println("Sub class integer argument constructor");

	}

	SubClass(String str) {
		// here by default super() call will be there so it will call super
		// class constructor
		System.out.println("Sub class String argument constructor");
	}

	public static void main(String[] args) {

		SubClass obj = new SubClass();

	}
}