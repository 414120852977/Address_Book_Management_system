package addressbook;

import java.util.ArrayList;
import java.util.List;

public class Mains {
	public static void main(String[] args) {
		Contact contact = new  Contact();
		
		System.out.println("**WELCOME TO ADDRESS BOOK MANAGEMENT SYSTEM**");
		
		Contact contacts = new Contact();
		Address address = new Address();
		Edit edit = new Edit();
		DeleteingContact deletecontact = new DeleteingContact();
		AddingMulContact addingcontact  = new AddingMulContact();
		
		contact.addContact("ashok", "mane", "at post sashtpimplegaon", "maharashtra", 431212, "ashok@gmail.com");
		contact.addContact("omkar", "bhagwat", "mp", "mh", 431212, "ashok@123");
		contacts.addContacts();
		address.added();
		edit.addeds();
		deletecontact.delete();
		addingcontact.addMultiple();
		
		List <String> list = new ArrayList<>();
		list.add(1, "ashok");
		list.add(2, "omkar");
		System.out.println(list);
		}
}
	
