package Com.Exception;

class SuperC{
	
	void display(){
		System.out.println("Soo sweet of dear SuperC");
	}
}

public class InheritanceTest extends SuperC{

	void show(){
		System.out.println("That brings the smile for you ");
	}
	
	void display(){
		System.out.println("Soo sweet of dear Inheri");
	}
	
	public static void main(String[] args) {
		SuperC sc = new SuperC();
		SuperC sc1 = new InheritanceTest();
		//InheritanceTest in = (InheritanceTest) new SuperC();

		sc.display();
		sc1.display();
		//in.show();
	}

}
