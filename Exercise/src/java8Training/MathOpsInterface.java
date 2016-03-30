package java8Training;

@FunctionalInterface
public interface MathOpsInterface<T,R> {

	public int mathOperation(Integer a, Integer b);
}
