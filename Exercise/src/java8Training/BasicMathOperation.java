package java8Training;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class BasicMathOperation {

	private static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

	public static void main(String args[]) {

		MathOpsInterface<Integer, Integer> mathAdd = (Integer x, Integer y) -> {
			return (x + y);
		};
		System.out.println("Addition is " + mathAdd.mathOperation(10, 10));

		MathOpsInterface<Integer, Integer> mathSub = (Integer x, Integer y) -> {
			return (x - y);
		};
		System.out.println("Substraction is " + mathSub.mathOperation(20, 10));

		MathOpsInterface<Integer, Integer> mathMul = (Integer x, Integer y) -> {
			return (x * y);
		};
		System.out.println("Multiplication is " + mathMul.mathOperation(10, 10));

		MathOpsInterface<Integer, Integer> mathDiv = (Integer x, Integer y) -> {
			return (x / y);
		};
		System.out.println("Division  is " + mathDiv.mathOperation(30, 10));

		//OrderInterface<Order, List<Order>> orderInterface = (Order orderObj) -> getOrders();
		//System.out.println("" + orderInterface.display(orderObj));
	}

	public static List<Order> getOrders() {
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order("1", 10000, "ACCEPTED"));
		orderList.add(new Order("14", 12000, "ACCEPTED"));
		orderList.add(new Order("21", 9000, "COMPLETED"));
		orderList.add(new Order("12", 15000, "ACCEPTED"));
		orderList.add(new Order("2", 1000, "COMPLETED"));
		orderList.add(new Order("3", 100000, "COMPLETED"));
		orderList.add(new Order("4", 7000, "ACCEPTED"));
		orderList.add(new Order("5", 20000, "ACCEPTED"));
		orderList.add(new Order("6", 60000, "ACCEPTED"));
		return orderList;

	}
}
