package addressbook;

import java.util.Scanner;
import addressbook.Contact;

public class Address extends Contact {
	
	public void added() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first name :");
	String name = sc.nextLine();
	System.out.println("enter a last name");
	String lname = sc.nextLine();
	System.out.println("enter a address");
	String address = sc.nextLine();
	System.out.println("enter a state");
	String state = sc.nextLine();
	System.out.println("enter a zip code ");
	int zip = sc.nextInt();
	System.out.println("enter a mail");
	String email = sc.nextLine();

	System.out.println("name is :"+name +""+ "last name :"+lname+""+"address is :"+address+""+"state is :"+state+""+"zip is:"+zip+""+"email"+email);
	}
}
