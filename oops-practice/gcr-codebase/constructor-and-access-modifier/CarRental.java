//Problem Statement: Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. 
//Add constructors to initialize the rental details and calculate total cost.

public class CarRental {
	String customerName;
	String carModel;
	int rentDays;
	int rentPrice = 1000;
	
	CarRental(String customerName, String carModel, int rentDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentDays = rentDays;
	}
	
	void totalCost() {
		System.out.println("Total Cost : "+ rentDays*rentPrice);
	}
	public static void main(String[] args) {
		CarRental car = new CarRental("Raju","Nano",5);
		car.totalCost();
	}

}
