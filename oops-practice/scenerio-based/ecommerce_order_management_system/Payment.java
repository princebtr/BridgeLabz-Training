package ecommerce_order_management_system;

public interface Payment {
	public void checkBalance();
	public void makePayment(double bill);
}
