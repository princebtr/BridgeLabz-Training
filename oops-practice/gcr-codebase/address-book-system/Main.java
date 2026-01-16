package AddressBookSystem;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Address Book :");

		System.out.println("Enter First Name : ");
		String firstName = input.next();
		
		System.out.println("Enter Last Name : ");
		String lastName = input.next();
		
		System.out.println("Enter Address : ");
		String address = input.next();
		
		System.out.println("Enter City : ");
		String city = input.next();
		
		System.out.println("Enter State : ");
		String state = input.next();
		
		System.out.println("Enter Zip Code : ");
		String zip = input.next();
		
		System.out.println("Enter Phone Number : ");
		String phoneNo = input.next();
		
		System.out.println("Enter Email : ");
		String email = input.next();
		
		Contact c = new Contact(firstName, lastName, address, city, state, zip, phoneNo, email);
		
		ContactServices cs = new ContactServices();
		cs.addContacts(c);
	}

}
