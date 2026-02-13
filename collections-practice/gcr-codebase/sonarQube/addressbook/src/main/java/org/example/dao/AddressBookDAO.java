package org.example.dao;

import org.example.model.Contact;
import java.util.List;

public interface AddressBookDAO {

    void addContact(Contact contact);
    void deleteContact(String firstName);
    List<Contact> getAllContacts();
}
