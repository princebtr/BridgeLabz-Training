//Use Case 2:
//Ability to add a new Contact to Address Book
package AddressBookSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServices {
	Scanner input = new Scanner(System.in);
	private static List<Contact> contactList = new ArrayList<>();
	
//	Method to add contact uc2
	public void addContacts(Contact c) {
		contactList.add(c);
	}
	
//	Method to search contact
	public Contact searchContact(String name) {
		Contact temp = null;
		for(Contact c : contactList) {
			if(c.getFirstName().toLowerCase().equals(name.toLowerCase())){
				System.out.println("Id : "+c.getId()+" | Name : "+c.getFirstName()+" "+ c.getLastName()+" | Address : "+c.getAddress()+" | City : "+c.getCity()+", "+c.getState()+", "+ c.getZip()+" | Phone No : "+ c.getPhoneNumber()+" | Email : "+ c.getEmail());
				temp = c;
			}
		}
		return temp;
	}
	
//	Method to edit Contact uc3
	public void editContact() {
		System.out.println("Edit Detail :\n1. First Name\n2. Last Name\n3. Address\n4. City \n5. State\n6. Zip Code\n7. Phone Number\n8. Email");
		int choice = input.nextInt();
		
		System.out.println("Enter firstName of Person : ");
		String name = input.next();
		
		Contact c = searchContact(name);
		
		System.out.println("Enter new field : ");
		String edit = input.next();
		
		switch(choice){
		case 1: c.setFirstName(edit);
		case 2: c.setLastName(edit);
		case 3: c.setAddress(edit);
		case 4: c.setCity(edit);
		case 5: c.setState(edit);
		case 6: c.setZip(edit);
		case 7: c.setPhoneNumber(edit);
		case 8: c.setEmail(edit);
		}
	}
}
			



