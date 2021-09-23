package com.blz.addressbook;

import java.util.ArrayList;

import com.blz.addressbook.dto.Contact;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System....!");
		ArrayList<Contact> personList = new ArrayList<>();
		Contact person = new Contact();
		personList.add(person);
		System.out.println(personList);
	}
	
}
