package prashantJavaExercise;

class SuperClass{
	void displayTest(){
		System.out.println("Test displayed  ");
	}
}

public class InterviewQuestions1 extends SuperClass{

	public String testValue(String arg){
		arg="Is value of arg is updated";
		return arg;
	}
	
	public static void main(String[] args) {
		SuperClass sc= new SuperClass();
		/*InterviewQuestions1 inter = (InterviewQuestions1)sc;
		inter.displayTest();*/
		
		InterviewQuestions1 obj = new InterviewQuestions1();
		String arg="orignal string value";
		obj.testValue(arg);
		System.out.println("Value is "+arg);
	}

}
