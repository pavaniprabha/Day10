package com.blz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.blz.addressbook.dto.Person;

public class AddressBook {

	static final Scanner SC = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<>();

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System....!");
		AddressBook addressBook = new AddressBook();
		addressBook.performOperations();
	}

	public void performOperations() {
		System.out.println("Enter 1 or 2");
		int option = SC.nextInt();
		switch (option) {
		case 1:
			addContact();
			break;
		case 2:
			editContact();
			break;
		default:
			System.out.println("Enter a valid number");
		}
		yesOrNo();
	}

	/**
	 * Adding new Contact to the Address Book
	 */
	public void addContact() {
		Person person = new Person();
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
	}

	/**
	 * Editing the existing contact in the Address Book
	 */
	public void editContact() {
		System.out.println("Enter User name to edit the contact");
		String firstName = SC.next();
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList);
			String name = personList.get(i).getFirstName();
			if (name.equals(firstName)) {
				System.out.println(
						"Choose from menu which index you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.Email");
				int choice = SC.nextInt();
				// Person person = new Person();
				switch (choice) {
				case 1:
					System.out.println("New First Name : ");
					personList.get(i).setFirstName(SC.next());
					break;
				case 2:
					System.out.println("New Last Name : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 3:
					System.out.println("New Address : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 4:
					System.out.println("New City : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 5:
					System.out.println("New State : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 6:
					System.out.println("New Zip : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 7:
					System.out.println("New Phone Number : ");
					personList.get(i).setLastName(SC.next());
					break;
				case 8:
					System.out.println("New Email : ");
					personList.get(i).setLastName(SC.next());
					break;
				default:
					System.out.println("Enter a valid number");
				}
				System.out.println(personList);
			}
		}
	}

	/**
	 * Asking the user that Do you want to perform again or not
	 */
	public void yesOrNo() {
		System.out.println("Do you want to perform again");
		System.out.println("Choose one Y or N");
		char choice = SC.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			performOperations();
		}

	}

}
