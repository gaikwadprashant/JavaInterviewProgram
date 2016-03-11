package Interviewsamples;

import java.io.FileNotFoundException;

class Sample{
	int size = 10;
	String name;
}


public class testPatel extends Sample{

	
	 static void test() throws FileNotFoundException{
		//try {
			int a =10;
			int b = a/0;
			throw new FileNotFoundException("got null pointer");
		//} catch (Exception e) {
			//System.out.println("Throw new checked exception");
		//}
		
	}
	public static void main(String args[])   {

		try {
			Sample s = new testPatel();
			//testPatel ts = (testPatel)new Sample();
			testPatel.test();
			throw new Exception();
		} catch (Exception e) {
			//throw new Exception();
		}finally{
			//throw new Exception();
		}

	}
}
