package java8Training;

public class Order {

	private String id;
	private int amount;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + ", status=" + status + "]";
	}
	public Order(String id, int amount, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.status = status;
	}
	
	
}
