
// Main.java
package packt.addressbook;

import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Entry point of the application
        System.out.println("Address Book Viewer Application");

        // Placeholder logic, replace with actual functionality
        ContactUtil contactUtil = new ContactUtil();
        SortUtil sortUtil = new SortUtil();

        // Retrieve contacts
        List<Contact> contacts = contactUtil.getContacts();

        // Sort contacts by last name
        List<Contact> sortedContacts = sortUtil.sortList(contacts, Comparator.comparing(Contact::getLastName));

        // Display contacts
        for (Contact contact : sortedContacts) {
            System.out.println(contact);
        }
    }
}

