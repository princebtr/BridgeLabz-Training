package ecommerce_order_management_system;
import java.util.*;
public class OrderManagement {
	Scanner input = new Scanner(System.in);
	private static List<Product> productList = new ArrayList<>();
	private static List<String> order = new ArrayList<>();
	int temp = -1;
	public void addProduct(Product p) {
		productList.add(p);
		System.out.println("Product added Sucessfully !!!");
	}
	
	public int productCatelog() {
		for(Product p : productList) {
			System.out.println("Id : "+p.getProductID()+" | Product Name : "+p.getProductName()+" | "+p.getProductType()+" | Size : "+p.getProductSize()+" | Price : "+p.getPrice());
		}
		System.out.println("Enter ID of product to Purchase :");
		temp = input.nextInt();
		return temp;
	}
	
	public void purchase(PaymentType pt) {
		boolean stop = false;
		int totalBill = 0;
		while(!stop) {
			System.out.println("1. Get Catelog\n2. Exit");
			int choice = input.nextInt();
			if(choice == 1) {
				int id = productCatelog();
				Product p = productList.get(id-1);
				System.out.println("Enter Quantity : ");
				int qty = input.nextInt();
				String str = "Id : "+p.getProductID()+" | Product Name : "+p.getProductName()+" | "+p.getProductType()+" | Size : "+p.getProductSize()+" | Price : "+p.getPrice()+" | Qty :"+qty+" | Bill : "+p.calculateBill(qty);
				order.add(str);
				System.out.println("Product added Sucessfully !!!\n"+ str);
				totalBill += p.calculateBill(qty);
				System.out.println("Want to Purchase more\n1. Yes | 2. No");
				int choice2 = input.nextInt();
				if(choice2 == 1) {
					continue;
				} else  {
					System.out.println("Total Bill : "+totalBill+"\nProcessing Payment !!!");
					pt.makePayment(totalBill);
					try {
						for(String s : order) {
							System.out.println(s);
						}
						System.out.println("Total Bill : "+totalBill);
						pt.checkBalance();
						return;
					} catch(PaymentFailedException e) {
						System.out.println(e.getMessage());

					}
					
				}

			} else if(choice == 2) {
				stop = true;
			} else {
				System.out.println("Enter Valid Choice");
				break;
			}
		}
	}
	
}
