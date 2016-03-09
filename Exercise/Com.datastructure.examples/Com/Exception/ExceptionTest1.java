package Com.Exception;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception {
		try {
			throw new Exception("In try block");
		} catch (Exception ex) {
			throw new Exception("in catch block");

		} finally {
			throw new Exception("in finally block");
		}

	}

}
