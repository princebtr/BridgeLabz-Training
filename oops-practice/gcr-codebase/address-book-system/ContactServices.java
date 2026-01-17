
package AddressBookSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServices {
	Scanner input = new Scanner(System.in);
	private static List<Contact> contactList = new ArrayList<>();
	
//	Method to add contact
//	Use Case 2: Ability to add a new Contact to Address Book
	public void addContacts(Contact c) {
		contactList.add(c);
		System.out.println("Contact Added Succesfully!!!");
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
		if(temp == null) {
			System.out.println("No Contact Found !!!");
		}
		return temp;
	}
	
//	Method to edit Contact 
//	Use Case 3: Ability to edit existing contact person using their name
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
				break;
		case 2: c.setLastName(edit);
				break;
		case 3: c.setAddress(edit);
				break;
		case 4: c.setCity(edit);
		  		break;
		case 5: c.setState(edit);
				break;
		case 6: c.setZip(edit);
				break;
		case 7: c.setPhoneNumber(edit);
				break;
		case 8: c.setEmail(edit);
				break;
		}
		System.out.println("Contact Edited Successfully!!!");
		searchContact(name);
	}
	
//	Method to delete contacts using name 
//	Use Case 4: Ability to delete a person using person's name
	public void deleteContact() {
		System.out.println("Enter Frist name of Contact to Delete");
		String fn = input.next();
		Contact c = searchContact(fn);
		contactList.remove(c.getId()-1);
		System.out.println("Contact Removed Successfully !!!");
	}
	
//	Method to Find Contact
	public void findContact() {
		System.out.println("Enter Frist name to Find Contact");
		String fn = input.next();
		Contact c = searchContact(fn);
	}
	
//	Method to display all Contacts
	public void displayContact() {
		if(contactList.isEmpty()) {
			System.out.println("Contact List is Empty!!!");
		}
		for(Contact c : contactList) {
			System.out.println("Id : "+c.getId()+" | Name : "+c.getFirstName()+" "+ c.getLastName()+" | Address : "+c.getAddress()+" | City : "+c.getCity()+", "+c.getState()+", "+ c.getZip()+" | Phone No : "+ c.getPhoneNumber()+" | Email : "+ c.getEmail());
		}
	}
}
			



