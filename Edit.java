package addressbook;

import addressbook.Address;

import java.util.Scanner;
public  class Edit extends Address {
	
		public  void addeds() {
			System.out.println("edit your address Book");
			System.out.println("enter a name to edit stored data :");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			
			if(name.equals(firstName)) {
				System.out.println("Enter a first name :");
				String fname = sc.nextLine();
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
				
				System.out.println("first name:"+fname+" "+"lastname:"+lname+"address:"+address+"state:"+" "+state+"zip code:"+zip+"email:"+email);
				System.out.println("**data edited successfully**");
		}
	}
}
