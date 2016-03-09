package Com.Exception;

import java.lang.reflect.Constructor;

public class SingletonTest {

	private static SingletonTest SingletonTestObj;
	
	private SingletonTest(){
		
	}
	
	public static SingletonTest getSingletonInstance(){
		if(null == SingletonTestObj){
			SingletonTestObj = new SingletonTest();
			System.out.println("Created new instance");
		}
		return SingletonTestObj;
	}
	
	public void display(){
		System.out.println("Inside display method");
	}
	
	public static void main(String[] args) {
		
		SingletonTest.getSingletonInstance().display();
		SingletonTest.getSingletonInstance().display();
		SingletonTest.getSingletonInstance().display();
		System.out.println("Hashcode for Singleton Object  "+SingletonTest.getSingletonInstance());
		System.out.println("Hashcode for Singleton Object  "+SingletonTest.getSingletonInstance());

	}

}

class Test {
    public void test() throws Exception {
        Constructor<SingletonTest> constructor = SingletonTest.class.getConstructor();
        constructor.setAccessible(true);
        SingletonTest otherSingleton = constructor.newInstance();
    }
}
