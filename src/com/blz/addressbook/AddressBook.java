package com.blz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.blz.addressbook.dto.Contact;


public class AddressBook {
 
	static final Scanner SC = new Scanner(System.in);
	ArrayList<Contact> personList = new ArrayList<>();

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System....!");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();

	}

	/**
	 * Adding new Contact to the Address Book
	 */
	public void addContact() {
		Contact person = new Contact();
		System.out.println("First Name : ");
		person.setFirstName(SC.next());
		System.out.println("Last Name : ");
		person.setLastName(SC.next());
		System.out.println("Address : ");
		person.setAddress(SC.next());
		System.out.println("City : ");
		person.setCity(SC.next());
		System.out.println("State : ");
		person.setState(SC.next());
		System.out.println("Zip : ");
		person.setZip(SC.next());
		System.out.println("Phone Number : ");
		person.setPhoneNumber(SC.next());
		System.out.println("Email : ");
		person.setEmail(SC.next());
		personList.add(person);
		System.out.println(personList);
		yesOrNo();
	}

	/**
	 * Asking the user that Do you want to perform again or not
	 */
	public void yesOrNo() {
		System.out.println("Do you want to perform again");
		System.out.println("Choose one Y or N");
		char choice = SC.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			addContact();
		}

	}

}
