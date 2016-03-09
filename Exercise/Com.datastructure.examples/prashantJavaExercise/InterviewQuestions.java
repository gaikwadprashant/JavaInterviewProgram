package prashantJavaExercise;

public class InterviewQuestions {

	public static void JavaTest(String s) {

		System.out.println("Sting is returned.");
	}

	private static void JavaTest(Exception e){
		System.out.println("In main Exception"+e);
	}
	
	private static void JavaTest(ArithmeticException ae){
		System.out.println("In sub class exception"+ae);
	}
	
	public static void JavaTest(Object o) {

		System.out.println("Object is returned.");
	}

		
	public static void main(String[] args) {
		NullPointerException e = null;
		JavaTest(e);

	}

}
