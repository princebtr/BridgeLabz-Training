package AddressBookSystem;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Address Book :");
		
//		Use Case 5: Ability to add multiple person to Address Book

		ContactServices cs = new ContactServices();
		int choice = 0;
		while(choice != 6) {
			System.out.println("1. Add Contact\n2. Edit Contact\n3. Delete Contacr\n4. Find Contact\n5. Display All Contact\n6. Exit");
			choice = input.nextInt();
			switch(choice) {
			case(1): 
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
				cs.addContacts(c);
				break;
			case(2): cs.editContact();
						break;
			case(3): cs.deleteContact();
						break;
			case(4): cs.findContact();
						break;
			case(5): cs.displayContact();
						break;
//			case(default): System.out.println("OOPS Wrong button press");

			}
		}	
	}

}
