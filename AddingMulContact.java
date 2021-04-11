package addressbook;

import java.util.Scanner;
import addressbook.Contact;

public class AddingMulContact extends Contact {
	
	public void addMultiple(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first name :");
	String names = sc.nextLine();
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
	
	System.out.println("first name:"+names+" "+"lastname:"+lname+"address:"+address+"state:"+" "+state+"zip code:"+zip+"email:"+email);
	}
}

