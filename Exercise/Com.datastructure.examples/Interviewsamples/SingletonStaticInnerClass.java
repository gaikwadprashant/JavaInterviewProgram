package Interviewsamples;

public class SingletonStaticInnerClass {

	private SingletonStaticInnerClass(){}
	
	private static class Singleton{
		//private static SingletonStaticInnerClass singleton = new SingletonStaticInnerClass();
		private static SingletonStaticInnerClass singleton =null;
	}
	
	public static SingletonStaticInnerClass getInstance(){
		if(null == Singleton.singleton){
			Singleton.singleton = new SingletonStaticInnerClass();
		}
		return Singleton.singleton;
	}
	
	public static void main(String[] args) {
		SingletonStaticInnerClass obj1 = SingletonStaticInnerClass.getInstance();
		SingletonStaticInnerClass obj2 = SingletonStaticInnerClass.getInstance();
		System.out.println("Hashcode for first Object is "+obj1.hashCode() +
				" Hashcode for second object is "+obj2.hashCode());
	}

}
