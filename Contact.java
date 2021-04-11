package addressbook;

import java.util.Scanner;
public class Contact {
	String firstName;
	String lastName;
	String address;
	String state;
	int zip;
	String email;
	
	public void addContact(String firstName,String lastName,String address , String state,int zip,String email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.email = email;
		
		System.out.println("firstname:"+" "+firstName+ " "+ "lastName is:"+" "+lastName+" "+ "adress is:"+" "+address+" "+ "state is:"+" "+state +" "+ "zip is:"+" "+zip +" "+ "email is:"+" "+email);
	}
	
		public void addContacts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name :");
		String firstNames = sc.nextLine();
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

		System.out.println("name is :"+firstNames +" "+ "last name :"+lname+" "+"address is :"+address+" "+"state is :"+state+" "+"zip is:"+zip+" "+"email"+email);
		}
	}
