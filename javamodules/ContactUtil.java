// util/ContactUtil.java
package packt.addressbook.util;

import packt.addressbook.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactUtil {
    public List<Contact> getContacts() {
        // Placeholder logic to retrieve contacts
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("1", "John", "Doe", "123-456-7890", "john@example.com", "987-654-3210"));
        contacts.add(new Contact("2", "Jane", "Smith", "234-567-8901", "jane@example.com", "876-543-2109"));
        // Add more contacts as needed

        return contacts;
    }
}
