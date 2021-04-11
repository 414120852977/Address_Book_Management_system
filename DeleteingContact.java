package addressbook;

import java.util.Scanner;
import addressbook.Contact;

public class DeleteingContact extends Contact  {
	public void delete() {
		System.out.println("Enter a name to delete data :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		if(name.equals(firstName)) {
			System.out.println("deleted data successfully");
		}
		else {
			System.out.println("not a present contact");
		}
	}
}
