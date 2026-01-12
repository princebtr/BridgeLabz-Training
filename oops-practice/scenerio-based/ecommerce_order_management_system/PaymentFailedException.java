package ecommerce_order_management_system;

public class PaymentFailedException extends RuntimeException {
	public PaymentFailedException(String message) {
		super(message);
	}
}
