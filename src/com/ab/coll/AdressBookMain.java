package com.ab.coll;

public class AdressBookMain {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.editContact();
		addressBook.deleteContact();
		addressBook.checkDuplicateContact();
		addressBook.searchByCityOrState();
		addressBook.NoOfContactPersons();
	}
}
