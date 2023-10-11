package com.promineotech;

public class ContactMain {

	public static void main(String[] args) {
		try {
			
			ContactManager contactManager = new ContactManager();
			contactManager.addContact("Alex", "Smith", "12345678910");
			contactManager.addContact("Anna", "Johnson", "14445556666");
			contactManager.addContact("Jenny", "Miller", "04445556666");
			
		} catch(Exception ex) {
			/**
			 * We are just printing out the error if we encounter it.
			 */
			ex.printStackTrace();
		}
	}
}
