package java8Training;

@FunctionalInterface
public interface OrderInterface<T,R> {

	public void display(Order order);
}
