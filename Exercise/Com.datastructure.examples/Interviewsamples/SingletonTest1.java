package Interviewsamples;


class Singleton{
	private static Singleton singleton;
	
	private Singleton(){	}
	
	Singleton(Singleton singleton){
		Singleton.singleton = singleton;		
	}
	public static Singleton getSingletonInstance(){
		if(null==singleton){
			singleton= new Singleton();
			System.out.println("Singleton object created only once");
		}
		return singleton;
	}
	
	public void display(){
		System.out.println("Display method");
	}
}

public class SingletonTest1 extends Singleton{
	SingletonTest1(Singleton singleton) {
		super(singleton);
		
	}


	static Singleton singletonObj;
	
	
	public static void main(String[] args) {
		//SingletonTest1 obj = new SingletonTest1(singletonObj);
		Singleton newobj = new Singleton(singletonObj);
		newobj.getSingletonInstance().display();
		Singleton.getSingletonInstance().display();
		/*Singleton.getSingletonInstance().display();
		Singleton.getSingletonInstance().display();
*/
	} 

}
