//Ability to add a new
//Contact to Address Book
package AddressBookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServices {
//	Scanner input = new Scanner(System.in);
	private static List<Contact> contactList = new ArrayList<>();
	
	public void addContacts(Contact c) {
		contactList.add(c);
	}
}
