package Interviewsamples;

enum  SingletonEnumFactory {

	INSTANCE;
    public static SingletonEnumFactory getInstance() {
        return INSTANCE;
    }
}


public class SingletonEnum {

	public static void main(String[] args) {
		SingletonEnumFactory singletonObj1 = SingletonEnumFactory.INSTANCE;
		SingletonEnumFactory singletonObj2 = SingletonEnumFactory.INSTANCE;
		System.out.println("Hashcodes are "+singletonObj1.hashCode() +" and "+singletonObj2.hashCode());
	}

}
