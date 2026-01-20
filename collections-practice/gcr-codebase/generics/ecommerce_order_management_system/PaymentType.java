package ecommerce_order_management_system;

public class PaymentType implements Payment{
	private User u;
	private String paymentType;
	private double balance;
	private int limitPerDay;
	public PaymentType(User u,String paymentType, double balance, int limitPerDay) {
		this.u = u;
		this.balance = balance;
		this.limitPerDay = limitPerDay;
		this.paymentType = paymentType;
	}
	public User getUser() {
		return u;
	}
	public double getBalance() {
		return balance;
	}
	public int getLimit() {
		return limitPerDay;
	}
	public String getPaymentType() {
		return paymentType;
	}
	@Override
	public void makePayment(double bill) {
		if(bill > balance) {
			throw new PaymentFailedException("Payment Failed !!! Insufficient account balance");
		}else if(bill > limitPerDay) {
			throw new PaymentFailedException("Payment Failed !!! Your limit of per day Expense Exceed");
		} else {
			System.out.println("Payment Successful !!!");
			this.balance = balance-bill;
		}
	}
	@Override
	public void checkBalance() {
		System.out.println("Name : "+u.getName()+"\nEmail : "+u.getEmail()+"\nAvailable Balance in "+paymentType+" : "+balance);
	}
}
