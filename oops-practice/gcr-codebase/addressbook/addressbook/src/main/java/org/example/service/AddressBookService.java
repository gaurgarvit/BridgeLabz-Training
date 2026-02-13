package org.example.service;

import org.example.model.Contact;
import java.util.List;

public interface AddressBookService {

    void addContact(Contact contact);
    void deleteContact(String firstName);
    List<Contact> getAllContacts();
}

