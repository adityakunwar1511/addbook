import java.util.*;
public class Main {
public static void main (String [] args) {
	AddressBook a1=new AddressBook();
	int i=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to addressbook");
	do {
		System.out.println("enter 1 to create contact");
		int input=sc.nextInt();
		switch(input) {
		case 1 -> createContact(a1);
		default -> System.out.println("WRONG INPUT");
		}
		System.out.println("enter 0 for EXIT");
		i=sc.nextInt();
	}while(i==0);
	
}
	static void createContact(AddressBook a1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter last name");
		String lname=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter phone");
		int phone=sc.nextInt();
		Contact c1 = new Contact(name,lname,city,phone);
        a1.addContact(c1);
	
}
	
}
