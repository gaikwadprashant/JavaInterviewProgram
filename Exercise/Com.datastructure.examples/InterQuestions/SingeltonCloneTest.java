package InterQuestions;

public class SingeltonCloneTest implements Cloneable{

	/**
	 * @param args
	 * @return
	 */
	private static SingeltonCloneTest instance = null;

	private SingeltonCloneTest() {
	}

	public static SingeltonCloneTest getInstance() {

		if (instance == null) {
			instance = new SingeltonCloneTest();
			return instance;
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		// TODO Auto-generated method stub
		/*
		 * Here forcibly throws the exception for preventing to be cloned
		 */
		throw new CloneNotSupportedException();
		//return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingeltonCloneTest test1 = SingeltonCloneTest.getInstance();

		try {
			SingeltonCloneTest test2 = (SingeltonCloneTest) test1.clone();
			System.out.println("Hashcode for original "+test1.hashCode());
			System.out.println("Hashcode for original "+test2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
